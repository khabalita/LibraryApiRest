package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.mapper.BookMapper;
import com.khabalita.springboot.libraryApi.repository.*;
import com.khabalita.springboot.libraryApi.services.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl
        extends BaseServiceImpl<Book, BookDto, Long>
        implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final AuthorRepository authorRepository;
    private final EditorialRepository editorialRepository;
    private final CategoryRepository categoryRepository;


    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper,
                           AuthorRepository authorRepository,
                           EditorialRepository editorialRepository,
                           CategoryRepository categoryRepository){
        super(bookRepository, bookMapper);
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
        this.editorialRepository = editorialRepository;
    }

    @Override
    public BookDto findBYISBN(String ISBN) {
        return bookMapper.toDto(bookRepository.findByISBN(ISBN));
    }

    @Override
    public List<BookDto> findBookByAuthorName(String author) {
        return bookMapper.toDtoList(bookRepository.findByAuthorNameContainingIgnoreCase(author));
    }

    @Override
    public List<BookDto> findBookByCategories(String categories) {
        return bookMapper.toDtoList(bookRepository.findByCategories_NameContainingIgnoreCase(categories));
    }
}
