package dev.mikchan.mcnp.motd.formatter.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.formatter.formatter.Formatter
import dev.mikchan.mcnp.motd.formatter.formatter.IFormatter

internal class FormatterCreator : IFormatterCreator {
    override fun build(plugin: MOTDPlugin): IFormatter {
        return Formatter()
    }
}
