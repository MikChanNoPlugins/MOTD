package dev.mikchan.mcnp.motd.config.config

interface IConfig {
    fun reload(): Boolean

    var enabled: Boolean
}
