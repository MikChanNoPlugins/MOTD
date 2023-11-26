package dev.mikchan.mcnp.motd.image.manager

import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.util.CachedServerIcon
import java.io.File
import kotlin.io.path.useDirectoryEntries

internal class ImageManager(private val plugin: MOTDPlugin) : IImageManager {
    private val iconFolder
        get() = run {
            val res = File(plugin.dataFolder, "icons")
            if (!res.exists()) {
                res.mkdir()
            }
            res.toPath()
        }

    private var cache = mapOf<String, CachedServerIcon>()

    override fun get(name: String): CachedServerIcon? {
        return cache["${name}.png"]
    }

    override fun getRandom(): CachedServerIcon? {
        return cache.values.ifEmpty { null }?.random()
    }

    override fun preload() {
        cache = try {
            iconFolder.useDirectoryEntries("*.png") { entries ->
                entries.map { path ->
                    path.fileName.toString() to try {
                        plugin.server.loadServerIcon(path.toFile())
                    } catch (_: Exception) {
                        null
                    }
                }.toMap().filter { it.value != null }.mapValues { it as CachedServerIcon }
            }
        } catch (_: Exception) {
            mapOf()
        }
    }


    override fun reload() {
        preload()
    }

    override fun unload() {
        cache = mapOf()
    }
}
