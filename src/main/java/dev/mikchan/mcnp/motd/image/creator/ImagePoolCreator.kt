package dev.mikchan.mcnp.motd.image.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.image.pool.IImagePool
import dev.mikchan.mcnp.motd.image.pool.ImagePool

internal class ImagePoolCreator : IImagePoolCreator {
    override fun build(plugin: MOTDPlugin): IImagePool {
        return ImagePool(plugin)
    }
}
