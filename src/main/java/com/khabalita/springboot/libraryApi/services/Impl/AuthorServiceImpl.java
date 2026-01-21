package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.mapper.AuthorMapper;
import com.khabalita.springboot.libraryApi.repository.AuthorRepository;
import com.khabalita.springboot.libraryApi.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl
        extends BaseServiceImpl<Author, AuthorDto, Long>
        implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorServiceImpl(AuthorRepository authorRepository,
                             AuthorMapper authorMapper){
        super(authorRepository, authorMapper);
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    @Override
    public List<AuthorDto> findByLastName(String lastName) {
        return authorMapper.toDtoList(authorRepository.findByLastName(lastName));
    }
}
