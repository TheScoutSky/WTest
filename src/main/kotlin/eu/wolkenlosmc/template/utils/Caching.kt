package eu.wolkenlosmc.template.utils

import eu.wolkenlosmc.template.Template
import eu.wolkenlosmc.template.database.DataClass
import eu.wolkenlosmc.template.database.MongoDB
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking
import org.bson.Document
import org.bukkit.scheduler.BukkitRunnable

object Caching {

    val cache = hashMapOf<String, DataClass>()

    /*
    * TODO: Add your caching methods here, Important you have to edit this class to your needs!
    *  This is just an example!
     */

    fun refreshCache() {
        object : BukkitRunnable() {
            override fun run() {
                runBlocking {
                    val localCache = cache
                    MongoDB.collection.find().collect {
                        if (cache[it.name] != it) cache[it.name] = it
                    }

                    localCache.forEach {
                        if (!cache.contains(it.key)) cache[it.key] = it.value
                    }

                    cache.forEach {
                        if (MongoDB.collection.find(Document().append("name", it.key)).firstOrNull() != null) MongoDB.collection.updateOne(Document().append("name", it.key), Document().append("$" + "set", it.value))
                        else MongoDB.collection.insertOne(it.value)
                    }
                }
            }
        }.runTaskTimer(Template.instance, 0, 20 * 20)
    }
}