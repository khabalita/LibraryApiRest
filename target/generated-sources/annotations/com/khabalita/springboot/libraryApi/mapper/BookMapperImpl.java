package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.dto.response.BookResponseDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.entities.Category;
import com.khabalita.springboot.libraryApi.entities.Editorial;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-26T09:25:18+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private EditorialMapper editorialMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<BookDto> toDtoList(List<Book> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( entities.size() );
        for ( Book book : entities ) {
            list.add( toDto( book ) );
        }

        return list;
    }

    @Override
    public BookDto toDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setAuthor( authorMapper.toDto( book.getAuthor() ) );
        bookDto.setEditorial( editorialMapper.toDto( book.getEditorial() ) );
        bookDto.setCategories( categoryMapper.toDtoList( book.getCategories() ) );
        bookDto.setISBN( book.getISBN() );
        bookDto.setTitle( book.getTitle() );
        bookDto.setSubTitle( book.getSubTitle() );
        bookDto.setEdition( book.getEdition() );

        return bookDto;
    }

    @Override
    public Book toEntity(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.author( authorMapper.toEntity( bookDto.getAuthor() ) );
        book.editorial( editorialMapper.toEntity( bookDto.getEditorial() ) );
        book.categories( categoryDtoListToCategoryList( bookDto.getCategories() ) );
        book.ISBN( bookDto.getISBN() );
        book.title( bookDto.getTitle() );
        book.subTitle( bookDto.getSubTitle() );
        book.edition( bookDto.getEdition() );

        return book.build();
    }

    @Override
    public BookResponseDto toResponseDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponseDto bookResponseDto = new BookResponseDto();

        bookResponseDto.setAuthorName( bookAuthorName( book ) );
        bookResponseDto.setEditorialName( bookEditorialName( book ) );
        bookResponseDto.setCategoriesName( categoryListToStringList( book.getCategories() ) );
        bookResponseDto.setISBN( book.getISBN() );
        bookResponseDto.setTitle( book.getTitle() );

        return bookResponseDto;
    }

    @Override
    public List<BookResponseDto> toListResponseDto(List<Book> books) {
        if ( books == null ) {
            return null;
        }

        List<BookResponseDto> list = new ArrayList<BookResponseDto>( books.size() );
        for ( Book book : books ) {
            list.add( toResponseDto( book ) );
        }

        return list;
    }

    protected List<Category> categoryDtoListToCategoryList(List<CategoryDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Category> list1 = new ArrayList<Category>( list.size() );
        for ( CategoryDto categoryDto : list ) {
            list1.add( categoryMapper.toEntity( categoryDto ) );
        }

        return list1;
    }

    private String bookAuthorName(Book book) {
        if ( book == null ) {
            return null;
        }
        Author author = book.getAuthor();
        if ( author == null ) {
            return null;
        }
        String name = author.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String bookEditorialName(Book book) {
        if ( book == null ) {
            return null;
        }
        Editorial editorial = book.getEditorial();
        if ( editorial == null ) {
            return null;
        }
        String name = editorial.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected List<String> categoryListToStringList(List<Category> list) {
        if ( list == null ) {
            return null;
        }

        List<String> list1 = new ArrayList<String>( list.size() );
        for ( Category category : list ) {
            list1.add( mapCategoryToString( category ) );
        }

        return list1;
    }
}
