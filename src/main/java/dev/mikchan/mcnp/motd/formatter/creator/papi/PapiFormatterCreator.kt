package dev.mikchan.mcnp.motd.formatter.creator.papi

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.formatter.creator.IFormatterCreator
import dev.mikchan.mcnp.motd.formatter.formatter.IFormatter
import dev.mikchan.mcnp.motd.formatter.formatter.papi.PapiFormatter
import me.clip.placeholderapi.PlaceholderAPIPlugin

internal class PapiFormatterCreator(private val fallback: IFormatterCreator) : IFormatterCreator {
    override fun build(plugin: MOTDPlugin): IFormatter {
        val papi = plugin.server.pluginManager.getPlugin("PlaceholderAPI") as? PlaceholderAPIPlugin?
        return papi?.let {
            plugin.logger.info("PlaceholderAPI found! Hooking in...")
            PapiFormatter()
        } ?: fallback.build(plugin)
    }
}
