
package eu.wolkenlosmc.template

import eu.wolkenlosmc.api.main.WolkenlosAPI
import eu.wolkenlosmc.template.config.Config
import eu.wolkenlosmc.template.database.MongoDB
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Template : JavaPlugin() {

    companion object {
        lateinit var instance : Template
        lateinit var wAPI : WolkenlosAPI
    }

    override fun onEnable() {
        instance = this
        wAPI = WolkenlosAPI(this)
        registerCommands()
        registerListeners()
        Config.load()
        MongoDB.connect()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    //Register Functions
    private fun registerCommands() {
        //getCommand("example")?.setExecutor(ExampleCommand())
        //getCommand("example")?.tabCompleter = ExampleCommand()
    }

    private fun registerListeners() {
        val manager = Bukkit.getPluginManager()
        //manager.registerEvents(ExampleListener(), this)
    }
}
