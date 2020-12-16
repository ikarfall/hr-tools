package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.Tag
import org.mapstruct.Mapper
import com.codecagon.hr.models.Tag as TagModel

@Mapper(componentModel = "spring", implementationName = "TagImportMapper")
interface TagMapper {
    fun toModel(tags: List<Tag>): List<TagModel>
}
