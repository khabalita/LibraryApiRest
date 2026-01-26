package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.request.BookRequestDto;
import com.khabalita.springboot.libraryApi.dto.response.BookResponseDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.entities.Category;
import com.khabalita.springboot.libraryApi.entities.Editorial;
import com.khabalita.springboot.libraryApi.mapper.BookMapper;
import com.khabalita.springboot.libraryApi.repository.*;
import com.khabalita.springboot.libraryApi.services.BookService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
                           CategoryRepository categoryRepository) {
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

    @Override
    public List<BookDto> getAllBooksDeleted() {
        List<Book> deletedBooks = bookRepository.findAllBooksDeleted();
        return baseMapper.toDtoList(deletedBooks);
    }

    @Override
    @Transactional
    public BookResponseDto saveSimple(BookRequestDto request){
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setSubTitle(request.getSubtitle());
        book.setISBN(request.getISBN());

        Author author = authorRepository.findById(request.getAuthorId())
                .orElseThrow(()-> new EntityNotFoundException("Author not found"));
        Editorial editorial = editorialRepository.findById(request.getEditorialId())
                .orElseThrow(()-> new EntityNotFoundException("Editorial not found"));
        List<Category> categoryList = categoryRepository.findAllById(request.getCategoriesId());

        book.setAuthor(author);
        book.setEditorial(editorial);
        book.setCategories(categoryList);

        Book savedBook = bookRepository.save(book);
        return bookMapper.toResponseDto(savedBook);
    }

}

