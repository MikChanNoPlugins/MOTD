package dev.mikchan.mcnp.motd.motd.manager

import dev.mikchan.mcnp.motd.config.config.IMOTDConfig
import dev.mikchan.mcnp.motd.image.manager.IImageManager
import org.bukkit.util.CachedServerIcon

internal class MOTDProxy(
    private val config: IMOTDConfig,
    private val imageManager: IImageManager,
) : IMOTD {
    override val firstLine: String?
        get() = config.firstLine
    override val secondLine: String?
        get() = config.secondLine
    override val image: CachedServerIcon?
        get() = config.image?.let { imageManager.get(it) }
}
