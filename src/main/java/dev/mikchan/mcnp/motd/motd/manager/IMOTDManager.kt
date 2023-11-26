package dev.mikchan.mcnp.motd.motd.manager

interface IMOTDManager {
    fun getRandom(personalized: Boolean = false): IMOTD?
}
