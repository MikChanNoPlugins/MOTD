package dev.mikchan.mcnp.motd.events.manager

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.events.listeners.MOTDListener
import org.bukkit.event.HandlerList

internal class EventManager(private val plugin: MOTDPlugin) : IEventManager {
    override fun registerAll() {
        unregisterAll()
        plugin.server.pluginManager.registerEvents(MOTDListener(plugin), plugin)
    }

    override fun unregisterAll() {
        HandlerList.unregisterAll(plugin)
    }
}
