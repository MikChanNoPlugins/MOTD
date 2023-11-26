package dev.mikchan.mcnp.motd.imagePool.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.imagePool.pool.IImagePool
import dev.mikchan.mcnp.motd.imagePool.pool.ImagePool

internal class ImagePoolCreator : IImagePoolCreator {
    override fun build(plugin: MOTDPlugin): IImagePool {
        return ImagePool(plugin)
    }
}
