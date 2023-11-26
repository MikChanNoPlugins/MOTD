package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.commands.manager.ICommandManager
import dev.mikchan.mcnp.motd.config.config.IConfig
import dev.mikchan.mcnp.motd.events.manager.IEventManager
import dev.mikchan.mcnp.motd.formatter.formatter.IFormatter
import dev.mikchan.mcnp.motd.image.manager.IImageManager
import dev.mikchan.mcnp.motd.motd.manager.IMOTDManager
import dev.mikchan.mcnp.motd.user.manager.IUserManager
import org.bstats.bukkit.Metrics
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class MOTDPlugin : JavaPlugin() {
    companion object {
        private const val BSTATS_ID = 20382
    }

    val config: IConfig by lazy { Creators.config.build(this) }
    val imageManager: IImageManager by lazy { Creators.imageManager.build(this) }
    val motdManager: IMOTDManager by lazy { Creators.motdManager.build(this) }
    val usersManager: IUserManager by lazy { Creators.userManager.build(this) }
    val formatter: IFormatter by lazy { Creators.formatter.build(this) }

    private val commandManager: ICommandManager by lazy { Creators.commandManager.build(this) }
    private val eventManager: IEventManager by lazy { Creators.eventManager.build(this) }

    override fun onEnable() {
        commandManager.registerAll()
        eventManager.registerAll()

        imageManager.preload()

        Metrics(this, BSTATS_ID)
    }

    override fun onDisable() {
        commandManager.unregisterAll()
        eventManager.unregisterAll()
    }
}
