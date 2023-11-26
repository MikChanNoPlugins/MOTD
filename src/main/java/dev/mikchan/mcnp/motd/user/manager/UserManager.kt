package dev.mikchan.mcnp.motd.user.manager

import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.net.InetAddress
import java.util.*

internal class UserManager(private val plugin: MOTDPlugin) : IUserManager {
    private var userCache: Map<InetAddress, UUID> = mapOf()

    override fun cache(player: Player) {
        val address = player.address?.address ?: return
        userCache += address to player.uniqueId
    }

    override fun get(address: InetAddress?): OfflinePlayer? {
        return userCache[address]?.let { plugin.server.getOfflinePlayer(it) }
    }
}
