package dev.mikchan.mcnp.motd.config.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.config.config.IConfig

interface IConfigCreator {
    fun build(plugin: MOTDPlugin): IConfig
}
