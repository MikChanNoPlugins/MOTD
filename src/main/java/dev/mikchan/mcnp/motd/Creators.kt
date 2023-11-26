package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.commands.creator.ICommandManagerCreator
import dev.mikchan.mcnp.motd.commands.creator.acf.ACFCommandManagerCreator
import dev.mikchan.mcnp.motd.config.creator.IConfigCreator
import dev.mikchan.mcnp.motd.config.creator.boostedYaml.BoostedYamlConfigCreator
import dev.mikchan.mcnp.motd.imagePool.creator.IImagePoolCreator
import dev.mikchan.mcnp.motd.imagePool.creator.ImagePoolCreator

object Creators {
    var config: IConfigCreator = BoostedYamlConfigCreator()
    var commandManager: ICommandManagerCreator = ACFCommandManagerCreator()
    var imagePool: IImagePoolCreator = ImagePoolCreator()
}
