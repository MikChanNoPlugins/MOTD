package dev.mikchan.mcnp.motd.motd.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.motd.manager.IMOTDManager

interface IMOTDManagerCreator {
    fun build(plugin: MOTDPlugin): IMOTDManager
}
