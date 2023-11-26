package dev.mikchan.mcnp.motd.events.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.events.manager.EventManager
import dev.mikchan.mcnp.motd.events.manager.IEventManager

internal class EventManagerCreator : IEventManagerCreator {
    override fun build(plugin: MOTDPlugin): IEventManager {
        return EventManager(plugin)
    }
}
