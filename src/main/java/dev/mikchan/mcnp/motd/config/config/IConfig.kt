package dev.mikchan.mcnp.motd.config.config

interface IConfig {
    fun reload(): Boolean

    var enabled: Boolean
    var randomImages: Boolean
    var mixMotd: Boolean
    var motd: List<IMOTDConfig>
    var personalizedMotd: List<IMOTDConfig>
}
