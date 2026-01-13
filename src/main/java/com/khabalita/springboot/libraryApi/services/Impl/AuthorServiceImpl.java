package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.mapper.AuthorMapper;
import com.khabalita.springboot.libraryApi.repository.AuthorRepository;
import com.khabalita.springboot.libraryApi.repository.BaseRepository;
import com.khabalita.springboot.libraryApi.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, Long> implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    public AuthorServiceImpl(BaseRepository<Author, Long> baseRepository){
        super(baseRepository);
    }

}
