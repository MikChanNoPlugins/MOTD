package dev.mikchan.mcnp.motd.motd.manager

import dev.mikchan.mcnp.motd.MOTDPlugin

internal class MOTDManager(private val plugin: MOTDPlugin) : IMOTDManager {
    override fun getRandom(personalized: Boolean): IMOTD? {
        val motd = if (personalized) plugin.config.motd + plugin.config.personalizedMotd else plugin.config.motd
        return motd.ifEmpty { null }?.random()?.let { MOTDProxy(it, plugin.imageManager) }
    }
}
