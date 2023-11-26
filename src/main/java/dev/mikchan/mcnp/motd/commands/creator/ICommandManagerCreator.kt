package dev.mikchan.mcnp.motd.commands.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.commands.manager.ICommandManager

interface ICommandManagerCreator {
    fun build(plugin: MOTDPlugin): ICommandManager
}
