package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.mapper.AuthorMapper;
import com.khabalita.springboot.libraryApi.repository.AuthorRepository;
import com.khabalita.springboot.libraryApi.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl
        extends BaseServiceImpl<Author, AuthorDto, Long>
        implements AuthorService {

    public AuthorServiceImpl(AuthorRepository authorRepository,
                             AuthorMapper authorMapper){
        super(authorRepository, authorMapper);
    }
}
