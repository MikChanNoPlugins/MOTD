package dev.mikchan.mcnp.motd.image.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.image.manager.IImageManager
import dev.mikchan.mcnp.motd.image.manager.ImageManager

internal class ImageManagerCreator : IImageManagerCreator {
    override fun build(plugin: MOTDPlugin): IImageManager {
        return ImageManager(plugin)
    }
}
