package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<Category, CategoryDto>{

}


