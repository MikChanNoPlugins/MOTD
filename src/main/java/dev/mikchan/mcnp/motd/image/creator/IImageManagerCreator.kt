package dev.mikchan.mcnp.motd.image.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.image.manager.IImageManager

interface IImageManagerCreator {
    fun build(plugin: MOTDPlugin): IImageManager
}
