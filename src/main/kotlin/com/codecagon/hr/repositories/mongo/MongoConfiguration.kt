package com.codecagon.hr.repositories.mongo


import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.core.convert.MongoCustomConversions


@Configuration
class MongoConfiguration : AbstractMongoClientConfiguration() {

    @Value("\${spring.data.mongodb.database:test}")
    protected lateinit var database: String

    override fun getDatabaseName(): String = database

    @Bean
    override fun customConversions(): MongoCustomConversions {
        return MongoCustomConversions(listOf(
                ZonedDateTimeToDocumentConverter(),
                DocumentToZonedDateTimeConverter()
        ))
    }
}
