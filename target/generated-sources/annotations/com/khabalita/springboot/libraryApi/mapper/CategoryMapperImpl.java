package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.entities.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-17T10:15:11+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toDto(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setName( entity.getName() );

        return categoryDto;
    }

    @Override
    public Category toEntity(CategoryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.name( dto.getName() );

        return category.build();
    }

    @Override
    public List<CategoryDto> toDtoList(List<Category> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( entities.size() );
        for ( Category category : entities ) {
            list.add( toDto( category ) );
        }

        return list;
    }
}
