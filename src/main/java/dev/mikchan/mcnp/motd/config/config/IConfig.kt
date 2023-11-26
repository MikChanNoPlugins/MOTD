package dev.mikchan.mcnp.motd.config.config

interface IConfig {
    fun reload(): Boolean

    var enabled: Boolean
    var randomImages: Boolean
    var motd: List<IMOTDConfig>
}
