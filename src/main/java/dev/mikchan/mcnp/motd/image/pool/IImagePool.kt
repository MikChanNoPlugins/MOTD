package dev.mikchan.mcnp.motd.image.pool

import org.bukkit.util.CachedServerIcon

interface IImagePool {
    fun get(name: String): CachedServerIcon?
    fun getRandom(): CachedServerIcon?

    fun preload()
    fun reload()
}
