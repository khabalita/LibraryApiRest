package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.services.AuthorService;
import com.khabalita.springboot.libraryApi.services.BookService;
import com.khabalita.springboot.libraryApi.services.Impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/books")
public class BookController
        extends BaseControllerImpl<BookDto, Long, BookService>{

    public BookController(BookService bookService) {
        super(bookService);
    }
}
