package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.commands.manager.ICommandManager
import dev.mikchan.mcnp.motd.config.config.IConfig
import dev.mikchan.mcnp.motd.image.manager.IImageManager
import dev.mikchan.mcnp.motd.motd.manager.IMOTDManager
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

    private val commandManager: ICommandManager by lazy { Creators.commandManager.build(this) }

    override fun onEnable() {
        commandManager.registerAll()
        imageManager.preload()

        Metrics(this, BSTATS_ID)
    }

    override fun onDisable() {
        commandManager.unregisterAll()
    }
}
