package dev.mikchan.mcnp.motd.formatter.formatter

import org.bukkit.OfflinePlayer

interface IFormatter {
    fun format(str: String, player: OfflinePlayer? = null): String
}
