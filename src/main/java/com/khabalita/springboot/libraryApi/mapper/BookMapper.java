package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {
    AuthorMapper.class, EditorialMapper.class, CategoryMapper.class
})
public interface BookMapper extends BaseMapper<Book, BookDto>{

    @Override
    @Mapping(source = "author", target = "authorDto")
    @Mapping(source = "editorial", target = "editorialDto")
    @Mapping(source = "category", target = "categoryDtoList")
    BookDto toDto(Book book);

    @Override
    @InheritInverseConfiguration
    Book toEntity(BookDto bookDto);
}
