package dev.mikchan.mcnp.motd.events.listeners

import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent
import org.bukkit.util.CachedServerIcon

internal class MOTDListener(private val plugin: MOTDPlugin) : Listener {
    @EventHandler(ignoreCancelled = true)
    fun onServerListPingEvent(event: ServerListPingEvent) {
        if (!plugin.config.enabled) return
        var icon: CachedServerIcon? = null

        plugin.motdManager.getRandom()?.apply {
            if (firstLine != null || secondLine != null) {
                val firstLine = firstLine?.let { plugin.formatter.format(it) } ?: ""
                val secondLine = secondLine?.let { plugin.formatter.format(it) } ?: ""
                event.motd = "${firstLine}\n${secondLine}"
            }

            icon = image
        }

        icon ?: if (plugin.config.randomImages) {
            plugin.imageManager.getRandom()
        } else {
            null
        }?.apply { event.setServerIcon(this) }
    }
}
