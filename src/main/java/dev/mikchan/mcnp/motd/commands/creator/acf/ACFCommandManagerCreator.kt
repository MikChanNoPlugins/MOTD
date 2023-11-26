package dev.mikchan.mcnp.motd.commands.creator.acf

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.commands.creator.ICommandManagerCreator
import dev.mikchan.mcnp.motd.commands.manager.ICommandManager
import dev.mikchan.mcnp.motd.commands.manager.acf.ACFCommandManager

internal class ACFCommandManagerCreator : ICommandManagerCreator {
    override fun build(plugin: MOTDPlugin): ICommandManager {
        return ACFCommandManager(plugin)
    }
}
