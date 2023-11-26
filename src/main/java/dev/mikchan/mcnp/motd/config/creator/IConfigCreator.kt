package dev.mikchan.mcnp.motd.config.creator

import dev.mikchan.mcnp.motd.MotdPlugin
import dev.mikchan.mcnp.motd.config.config.IConfig

interface IConfigCreator {
    fun build(plugin: MotdPlugin): IConfig
}
