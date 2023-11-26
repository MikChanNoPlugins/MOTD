package dev.mikchan.mcnp.motd.user.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.user.manager.IUserManager

interface IUserManagerCreator {
    fun build(plugin: MOTDPlugin): IUserManager
}
