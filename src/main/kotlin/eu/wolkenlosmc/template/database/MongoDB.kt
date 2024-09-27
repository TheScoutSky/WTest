package eu.wolkenlosmc.template.database

import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoCollection
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import eu.wolkenlosmc.template.Template
import eu.wolkenlosmc.template.config.Config
import org.bson.Document

object MongoDB {

    lateinit var client: MongoClient
    lateinit var database: MongoDatabase
    lateinit var collection: MongoCollection<DataClass>
    var connected = false
    
    private const val COLLECTION_NAME = "wtab" //TODO: Change this to your collection name

    fun connect() {
        try {
            client = MongoClient.create(Config.mongoURI())
            database = client.getDatabase(Config.database())
            collection = database.getCollection<DataClass>(COLLECTION_NAME)
            Template.instance.logger.info("Connected to MongoDB!")
            connected = true
        } catch (e: Exception) {
            Template.instance.logger.warning("Could not connect to MongoDB!")
            e.printStackTrace()
        }
    }
}