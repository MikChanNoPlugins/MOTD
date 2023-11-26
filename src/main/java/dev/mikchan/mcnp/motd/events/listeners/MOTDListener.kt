package dev.mikchan.mcnp.motd.events.listeners

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.motd.manager.IMOTD
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent
import org.bukkit.util.CachedServerIcon

internal class MOTDListener(private val plugin: MOTDPlugin) : Listener {
    private fun getIcon(motd: IMOTD?): CachedServerIcon? {
        if (motd?.image != null) return motd.image
        if (plugin.config.randomImages) return plugin.imageManager.getRandom()
        return null
    }

    @EventHandler(ignoreCancelled = true)
    fun onServerListPingEvent(event: ServerListPingEvent) {
        if (!plugin.config.enabled) return
        val player = plugin.usersManager.get(event.address)
        val motd = plugin.motdManager.getRandom(player != null)

        motd?.apply {
            if (firstLine == null && secondLine == null) return@apply

            val firstLine = firstLine?.let { plugin.formatter.format(it, player) } ?: ""
            val secondLine = secondLine?.let { plugin.formatter.format(it, player) } ?: ""
            event.motd = "${firstLine}\n${secondLine}"
        }

        getIcon(motd)?.apply { event.setServerIcon(this) }
    }
}
