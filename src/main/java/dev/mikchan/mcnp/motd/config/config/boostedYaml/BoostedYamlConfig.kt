package dev.mikchan.mcnp.motd.config.config.boostedYaml

import dev.dejvokep.boostedyaml.YamlDocument
import dev.dejvokep.boostedyaml.dvs.versioning.BasicVersioning
import dev.dejvokep.boostedyaml.settings.dumper.DumperSettings
import dev.dejvokep.boostedyaml.settings.general.GeneralSettings
import dev.dejvokep.boostedyaml.settings.loader.LoaderSettings
import dev.dejvokep.boostedyaml.settings.updater.UpdaterSettings
import dev.dejvokep.boostedyaml.spigot.SpigotSerializer
import dev.mikchan.mcnp.motd.config.config.IConfig
import dev.mikchan.mcnp.motd.config.config.IMOTDConfig
import java.io.File
import java.io.InputStream

internal class BoostedYamlConfig(document: File, resource: InputStream) : IConfig {
    private val config: YamlDocument = YamlDocument.create(
        document,
        resource,
        GeneralSettings.builder().setSerializer(SpigotSerializer.getInstance()).build(),
        LoaderSettings.builder().setAutoUpdate(true).build(),
        DumperSettings.DEFAULT,
        UpdaterSettings.builder().setVersioning(BasicVersioning("config-version")).build(),
    )

    override fun reload(): Boolean {
        return config.reload()
    }

    override var enabled: Boolean
        get() = config.getBoolean("enabled", false)
        set(value) {
            config.set("enabled", value)
            config.save()
        }

    override var randomImages: Boolean
        get() = config.getBoolean("random-images", false)
        set(value) {
            config.set("random-images", value)
            config.save()
        }
    override var motd: List<IMOTDConfig>
        get() = config.getMapList("motd", listOf()).filterNotNull().map { BoostedYamlProxyMOTDConfig(it) }
        set(value) {
            config.set("motd", value.map {
                mapOf(
                    "first-line" to it.firstLine,
                    "second-line" to it.secondLine,
                    "image" to it.image,
                ).filter { m -> m.value != null }
            })
        }
}
