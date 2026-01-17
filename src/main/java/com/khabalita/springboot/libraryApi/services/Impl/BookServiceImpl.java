package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.mapper.AuthorMapper;
import com.khabalita.springboot.libraryApi.mapper.BookMapper;
import com.khabalita.springboot.libraryApi.mapper.CategoryMapper;
import com.khabalita.springboot.libraryApi.mapper.EditorialMapper;
import com.khabalita.springboot.libraryApi.repository.*;
import com.khabalita.springboot.libraryApi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl
        extends BaseServiceImpl<Book, BookDto, Long>
        implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private EditorialRepository editorialRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private EditorialMapper editorialMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper){
        super(bookRepository, bookMapper);
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

}
