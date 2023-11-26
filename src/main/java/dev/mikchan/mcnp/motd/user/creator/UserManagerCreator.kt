package dev.mikchan.mcnp.motd.user.creator

import dev.mikchan.mcnp.motd.MOTDPlugin
import dev.mikchan.mcnp.motd.user.manager.IUserManager
import dev.mikchan.mcnp.motd.user.manager.UserManager

internal class UserManagerCreator : IUserManagerCreator {
    override fun build(plugin: MOTDPlugin): IUserManager {
        return UserManager(plugin)
    }
}
