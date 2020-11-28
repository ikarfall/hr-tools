package com.codecagon.hr.repositories.mongo

import org.bson.Document
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.stereotype.Component
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.*

@Component
@ReadingConverter
class DocumentToZonedDateTimeConverter : Converter<Document, ZonedDateTime> {
    override fun convert(document: Document): ZonedDateTime {
        val dateTime: Date = document.getDate(ZonedDateTimeToDocumentConverter.DATE_TIME)
        val zoneId: String = document.getString(ZonedDateTimeToDocumentConverter.ZONE)
        val zone = ZoneId.of(zoneId)
        return ZonedDateTime.ofInstant(dateTime.toInstant(), zone)
    }
}
