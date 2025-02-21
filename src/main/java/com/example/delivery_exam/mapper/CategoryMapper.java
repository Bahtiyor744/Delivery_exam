package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.CategoryDTO;
import com.example.delivery_exam.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toCategoryDTO(Category category);
    Category toCategory(CategoryDTO categoryDTO);

}
