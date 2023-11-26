package dev.mikchan.mcnp.motd.imagePool.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.imagePool.pool.IImagePool

interface IImagePoolCreator {
    fun build(plugin: MOTDPlugin): IImagePool
}
