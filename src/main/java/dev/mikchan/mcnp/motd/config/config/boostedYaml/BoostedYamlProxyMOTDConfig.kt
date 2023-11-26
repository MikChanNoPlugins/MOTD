package dev.mikchan.mcnp.motd.config.config.boostedYaml

import dev.mikchan.mcnp.motd.config.config.IMOTDConfig

internal class BoostedYamlProxyMOTDConfig(private val motd: Map<*, *>) : IMOTDConfig {
    override val firstLine: String?
        get() = motd["first-line"] as? String

    override val secondLine: String?
        get() = motd["second-line"] as? String

    override val image: String?
        get() = motd["image"] as? String
}
