package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.response.BookResponseDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
    AuthorMapper.class, EditorialMapper.class, CategoryMapper.class
})
public interface BookMapper extends BaseMapper<Book, BookDto>{

    @Override
    @Mapping(source = "author", target = "author")
    @Mapping(source = "editorial", target = "editorial")
    @Mapping(source = "categories", target = "categories")
    BookDto toDto(Book book);

    @Override
    @InheritInverseConfiguration
    Book toEntity(BookDto bookDto);

    @Mapping(source = "author.name", target = "authorName")
    @Mapping(source = "editorial.name", target = "editorialName")
    @Mapping(source = "categories", target = "categoriesName")
    BookResponseDto toResponseDto(Book book);

    List<BookResponseDto> toListResponseDto(List<Book> books);

    default String mapCategoryToString(Category category){
        return category == null ? null : category.getName();
    }

}
