package dev.mikchan.mcnp.motd.formatter.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.formatter.formatter.IFormatter

interface IFormatterCreator {
    fun build(plugin: MOTDPlugin): IFormatter
}
