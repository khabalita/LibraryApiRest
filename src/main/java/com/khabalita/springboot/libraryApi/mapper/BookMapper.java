package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends BaseMapper<Book, BookDto>{

}
