package dev.mikchan.mcnp.motd.commands.manager.acf.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Description
import co.aikar.commands.annotation.Subcommand
import dev.mikchan.mcnp.motd.MOTDPlugin
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender

@CommandAlias("motd")
@CommandPermission("mcn.motd.admin")
internal class AdminCommand(private val plugin: MOTDPlugin) : BaseCommand() {
    @Subcommand("enable")
    @Description("Enables custom MOTD")
    fun onEnable(sender: CommandSender) {
        if (plugin.config.enabled) {
            sender.sendMessage("${ChatColor.YELLOW}Custom MOTD is already enabled.")
        } else {
            plugin.config.enabled = true
            sender.sendMessage("${ChatColor.GREEN}Custom MOTD is successfully enabled.")
        }
    }

    @Subcommand("disable")
    @Description("Disables custom MOTD")
    fun onDisable(sender: CommandSender) {
        if (plugin.config.enabled) {
            plugin.config.enabled = false
            sender.sendMessage("${ChatColor.GREEN}Custom MOTD is successfully disabled.")
        } else {
            sender.sendMessage("${ChatColor.YELLOW}Custom MOTD is already disabled.")
        }
    }

    @Subcommand("status")
    @Description("Checks custom MOTD status")
    fun onStatus(sender: CommandSender) {
        if (plugin.config.enabled) {
            sender.sendMessage("${ChatColor.YELLOW}Custom MOTD is ${ChatColor.GREEN}enabled${ChatColor.YELLOW}.")
        } else {
            sender.sendMessage("${ChatColor.YELLOW}Custom MOTD is ${ChatColor.RED}disabled${ChatColor.YELLOW}.")
        }
    }

    @Subcommand("reload")
    @Description("Reloads config")
    fun onReload(sender: CommandSender) {
        if (plugin.config.reload()) {
            plugin.imageManager.reload()
            sender.sendMessage("${ChatColor.GREEN}Config is successfully reloaded!")
        } else {
            sender.sendMessage("${ChatColor.RED}Unable to reload config!")
        }
    }
}
