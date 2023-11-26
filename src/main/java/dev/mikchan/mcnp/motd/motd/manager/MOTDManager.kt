package dev.mikchan.mcnp.motd.motd.manager

import dev.mikchan.mcnp.motd.MOTDPlugin

internal class MOTDManager(private val plugin: MOTDPlugin) : IMOTDManager {
    override fun getRandom(): IMOTD? {
        return plugin.config.motd.ifEmpty { null }?.random()?.let { MOTDProxy(it, plugin.imageManager) }
    }
}
