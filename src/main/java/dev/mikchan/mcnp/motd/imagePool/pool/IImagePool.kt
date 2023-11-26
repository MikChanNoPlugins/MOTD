package dev.mikchan.mcnp.motd.imagePool.pool

import org.bukkit.util.CachedServerIcon

interface IImagePool {
    fun get(name: String): CachedServerIcon?
    fun getRandom(): CachedServerIcon?

    fun preload()
    fun reload()
}
