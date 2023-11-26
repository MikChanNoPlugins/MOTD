package dev.mikchan.mcnp.motd.motd.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.motd.manager.MOTDManager
import dev.mikchan.mcnp.motd.motd.manager.IMOTDManager

internal class MOTDManagerCreator : IMOTDManagerCreator {
    override fun build(plugin: MOTDPlugin): IMOTDManager {
        return MOTDManager(plugin)
    }
}
