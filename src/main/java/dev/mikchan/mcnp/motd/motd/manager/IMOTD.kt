package dev.mikchan.mcnp.motd.motd.manager

import org.bukkit.util.CachedServerIcon

@Suppress("SpellCheckingInspection")
interface IMOTD {
    val firstLine: String?
    val secondLine: String?
    val image: CachedServerIcon?
}
