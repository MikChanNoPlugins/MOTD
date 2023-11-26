package dev.mikchan.mcnp.motd.commands.manager.acf

import co.aikar.commands.PaperCommandManager
import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.commands.manager.ICommandManager
import dev.mikchan.mcnp.motd.commands.manager.acf.commands.AdminCommand

internal class ACFCommandManager(private val plugin: MOTDPlugin) : ICommandManager {
    private val manager by lazy { PaperCommandManager(plugin) }
    override fun registerAll() {
        manager.registerCommand(AdminCommand(plugin))
    }

    override fun unregisterAll() {
        manager.unregisterCommands()
    }
}
