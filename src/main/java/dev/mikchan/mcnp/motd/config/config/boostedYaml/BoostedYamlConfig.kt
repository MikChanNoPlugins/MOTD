package dev.mikchan.mcnp.motd.config.config.boostedYaml

import dev.dejvokep.boostedyaml.YamlDocument
import dev.dejvokep.boostedyaml.dvs.versioning.BasicVersioning
import dev.dejvokep.boostedyaml.settings.dumper.DumperSettings
import dev.dejvokep.boostedyaml.settings.general.GeneralSettings
import dev.dejvokep.boostedyaml.settings.loader.LoaderSettings
import dev.dejvokep.boostedyaml.settings.updater.UpdaterSettings
import dev.dejvokep.boostedyaml.spigot.SpigotSerializer
import dev.mikchan.mcnp.motd.config.config.IConfig
import java.io.File
import java.io.InputStream

internal class BoostedYamlConfig(document: File, resource: InputStream) : IConfig {
    private val config: YamlDocument = YamlDocument.create(
        document,
        resource,
        GeneralSettings.builder().setSerializer(SpigotSerializer.getInstance()).build(),
        LoaderSettings.builder().setAutoUpdate(true).build(),
        DumperSettings.DEFAULT,
        UpdaterSettings.builder().setVersioning(BasicVersioning("configVersion")).build(),
    )

    override fun reload(): Boolean {
        return config.reload()
    }
}
