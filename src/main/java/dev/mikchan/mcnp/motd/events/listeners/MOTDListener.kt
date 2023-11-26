package dev.mikchan.mcnp.motd.events.listeners

import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent

internal class MOTDListener(private val plugin: MOTDPlugin) : Listener {
    @EventHandler(ignoreCancelled = true)
    fun onServerListPingEvent(event: ServerListPingEvent) {
        if (!plugin.config.enabled) return
        val motd = plugin.motdManager.getRandom() ?: return

        if (motd.firstLine != null || motd.secondLine != "") {
            val firstLine = motd.firstLine ?: ""
            val secondLine = motd.secondLine ?: ""
            event.motd = "${firstLine}\n${secondLine}"
        }

        val image = motd.image?.let {
            if (plugin.config.randomImages) {
                plugin.imageManager.getRandom()
            } else {
                null
            }
        }

        if (image != null) {
            event.setServerIcon(image)
        }
    }
}
