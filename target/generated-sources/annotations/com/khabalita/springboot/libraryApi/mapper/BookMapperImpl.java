package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import com.khabalita.springboot.libraryApi.entities.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-17T10:44:18+0100",
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

        bookDto.setAuthorDto( authorMapper.toDto( book.getAuthor() ) );
        bookDto.setEditorialDto( editorialMapper.toDto( book.getEditorial() ) );
        bookDto.setCategoryDtoList( categoryMapper.toDtoList( book.getCategory() ) );
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

        book.author( authorMapper.toEntity( bookDto.getAuthorDto() ) );
        book.editorial( editorialMapper.toEntity( bookDto.getEditorialDto() ) );
        book.category( categoryDtoListToCategoryList( bookDto.getCategoryDtoList() ) );
        book.ISBN( bookDto.getISBN() );
        book.title( bookDto.getTitle() );
        book.subTitle( bookDto.getSubTitle() );
        book.edition( bookDto.getEdition() );

        return book.build();
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
}
