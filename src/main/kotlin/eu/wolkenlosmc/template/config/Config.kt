package eu.wolkenlosmc.template.config

import eu.wolkenlosmc.api.utils.ConfigFile

object Config {
    
    private const val configName = "config.yml" //TODO: Change this to your config name
    //INFO: Your Config Name should be the same as the file in src/main/resources

    fun load() {
        ConfigFile(configName)
    }

    fun get(key: String): Any? {
        return ConfigFile(configName).config.get(key)
    }

    fun set(key: String, value: Any) {
        val file = ConfigFile(configName)
        file.config.set(key, value)
        file.save()
    }


    fun prefix(): String {
        return ConfigFile(configName).config.getString("prefix")!!
    }
    fun mongoURI(): String {
        return ConfigFile(configName).config.getString("mongo_uri")!!
    }
    fun database(): String {
        return ConfigFile(configName).config.getString("database")!!
    }

    fun save() {
        ConfigFile(configName).save()
    }

}