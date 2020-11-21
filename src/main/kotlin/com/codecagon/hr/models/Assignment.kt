package com.codecagon.hr.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.ZonedDateTime
import java.util.*

@Document
open class Assignment(@Id val id: UUID, start: ZonedDateTime, end:ZonedDateTime){


}
