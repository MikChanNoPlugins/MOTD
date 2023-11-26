package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.commands.creator.ICommandManagerCreator
import dev.mikchan.mcnp.motd.commands.creator.acf.ACFCommandManagerCreator
import dev.mikchan.mcnp.motd.config.creator.IConfigCreator
import dev.mikchan.mcnp.motd.config.creator.boostedYaml.BoostedYamlConfigCreator

object Creators {
    var config: IConfigCreator = BoostedYamlConfigCreator()
    var commandManager: ICommandManagerCreator = ACFCommandManagerCreator()
}
