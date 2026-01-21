package com.khabalita.springboot.libraryApi.repository;

import com.khabalita.springboot.libraryApi.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends BaseRepository<Book, Long> {

    Book findByISBN(String ISBN);
    List<Book> findByAuthorNameContainingIgnoreCase(String author);
    List<Book> findByCategories_NameContainingIgnoreCase(String categories);
}
