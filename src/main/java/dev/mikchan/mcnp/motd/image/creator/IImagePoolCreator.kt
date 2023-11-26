package dev.mikchan.mcnp.motd.image.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.image.pool.IImagePool

interface IImagePoolCreator {
    fun build(plugin: MOTDPlugin): IImagePool
}
