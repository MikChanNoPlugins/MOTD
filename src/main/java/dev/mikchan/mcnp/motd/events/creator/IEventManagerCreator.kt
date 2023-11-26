package dev.mikchan.mcnp.motd.events.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.events.manager.IEventManager

interface IEventManagerCreator {
    fun build(plugin: MOTDPlugin): IEventManager
}
