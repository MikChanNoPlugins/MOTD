package dev.mikchan.mcnp.motd.formatter.formatter

import org.bukkit.ChatColor
import org.bukkit.OfflinePlayer

internal class Formatter : IFormatter {
    override fun format(str: String, player: OfflinePlayer?): String {
        return ChatColor.translateAlternateColorCodes('&', str)
    }
}
