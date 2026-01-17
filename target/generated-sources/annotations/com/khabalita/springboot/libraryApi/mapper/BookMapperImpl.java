package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.entities.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-17T10:15:11+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto toDto(Book entity) {
        if ( entity == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setISBN( entity.getISBN() );
        bookDto.setTitle( entity.getTitle() );
        bookDto.setSubTitle( entity.getSubTitle() );
        bookDto.setEdition( entity.getEdition() );

        return bookDto;
    }

    @Override
    public Book toEntity(BookDto dto) {
        if ( dto == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.ISBN( dto.getISBN() );
        book.title( dto.getTitle() );
        book.subTitle( dto.getSubTitle() );
        book.edition( dto.getEdition() );

        return book.build();
    }

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
}
