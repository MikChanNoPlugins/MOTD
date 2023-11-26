package dev.mikchan.mcnp.motd.config.creator.boostedYaml

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.config.config.IConfig
import dev.mikchan.mcnp.motd.config.config.boostedYaml.BoostedYamlConfig
import dev.mikchan.mcnp.motd.config.creator.IConfigCreator
import java.io.File

internal class BoostedYamlConfigCreator : IConfigCreator {
    override fun build(plugin: MOTDPlugin): IConfig {
        val resource = plugin.getResource("config.yml")!!
        val document = File(plugin.dataFolder, "config.yml")
        return BoostedYamlConfig(document, resource)
    }
}
