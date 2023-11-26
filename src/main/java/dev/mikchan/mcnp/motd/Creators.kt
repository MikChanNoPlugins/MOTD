package dev.mikchan.mcnp.motd

import dev.mikchan.mcnp.motd.commands.creator.ICommandManagerCreator
import dev.mikchan.mcnp.motd.commands.creator.acf.ACFCommandManagerCreator
import dev.mikchan.mcnp.motd.config.creator.IConfigCreator
import dev.mikchan.mcnp.motd.config.creator.boostedYaml.BoostedYamlConfigCreator
import dev.mikchan.mcnp.motd.events.creator.EventManagerCreator
import dev.mikchan.mcnp.motd.events.creator.IEventManagerCreator
import dev.mikchan.mcnp.motd.image.creator.IImageManagerCreator
import dev.mikchan.mcnp.motd.image.creator.ImageManagerCreator
import dev.mikchan.mcnp.motd.motd.creator.IMOTDManagerCreator
import dev.mikchan.mcnp.motd.motd.creator.MOTDManagerCreator

object Creators {
    var config: IConfigCreator = BoostedYamlConfigCreator()
    var commandManager: ICommandManagerCreator = ACFCommandManagerCreator()
    var imageManager: IImageManagerCreator = ImageManagerCreator()
    var motdManager: IMOTDManagerCreator = MOTDManagerCreator()
    var eventManager: IEventManagerCreator = EventManagerCreator()
}
