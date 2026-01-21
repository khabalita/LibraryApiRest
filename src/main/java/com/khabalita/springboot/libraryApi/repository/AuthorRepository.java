package com.khabalita.springboot.libraryApi.repository;

import com.khabalita.springboot.libraryApi.entities.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends BaseRepository<Author, Long> {

    List<Author> findByLastName(String lastName);
    List<Author> findByNameContainingIgnoreCase(String name);

}
