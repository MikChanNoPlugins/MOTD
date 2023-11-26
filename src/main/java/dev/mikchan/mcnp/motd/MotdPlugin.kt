package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.config.config.IConfig
import org.bstats.bukkit.Metrics
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class MotdPlugin : JavaPlugin() {
    companion object {
        private const val BSTATS_ID = 20382
    }

    private val config: IConfig by lazy { Creators.config.build(this) }

    override fun onEnable() {
        Metrics(this, BSTATS_ID)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
