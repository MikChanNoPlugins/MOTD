package dev.mikchan.mcnp.motd.user.manager

import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.net.InetAddress

interface IUserManager {
    fun cache(player: Player)
    fun get(address: InetAddress?): OfflinePlayer?
}
