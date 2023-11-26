package dev.mikchan.mcnp.motd.events.listeners

import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

internal class JoinListener(private val plugin: MOTDPlugin) : Listener {
    @EventHandler(ignoreCancelled = true)
    fun onPlayerJoinEvent(event: PlayerJoinEvent) {
        if (!plugin.config.enabled) return
        plugin.usersManager.cache(event.player)
    }
}
