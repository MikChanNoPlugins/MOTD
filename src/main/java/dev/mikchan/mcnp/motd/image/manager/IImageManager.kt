package dev.mikchan.mcnp.motd.image.manager

import org.bukkit.util.CachedServerIcon

interface IImageManager {
    fun get(name: String): CachedServerIcon?
    fun getRandom(): CachedServerIcon?

    fun preload()
    fun reload()
    fun unload()
}
