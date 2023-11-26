package dev.mikchan.mcnp.motd.formatter.formatter.papi

import dev.mikchan.mcnp.motd.formatter.formatter.IFormatter
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.ChatColor
import org.bukkit.OfflinePlayer

internal class PapiFormatter : IFormatter {
    override fun format(str: String, player: OfflinePlayer?): String {
        val format = PlaceholderAPI.setPlaceholders(player, str)
        return ChatColor.translateAlternateColorCodes('&', format)
    }
}
