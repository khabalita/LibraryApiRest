package com.khabalita.springboot.libraryApi.services;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.request.BookRequestDto;
import com.khabalita.springboot.libraryApi.dto.response.BookResponseDto;

import java.util.List;

public interface BookService extends BaseService<BookDto, Long>{

    BookDto findBYISBN(String ISBN);
    List<BookDto> findBookByAuthorName(String author);
    List<BookDto> findBookByCategories(String categories);
    List<BookDto> getAllBooksDeleted();
    BookResponseDto saveSimple(BookRequestDto bookRequestDto);
}
