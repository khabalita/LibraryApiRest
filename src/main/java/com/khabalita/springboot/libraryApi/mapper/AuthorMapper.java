package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorMapper{

    @Autowired
    private ModelMapper modelMapper;

    public Author authorDtoToAuthor(AuthorDto authorDto){
        Author author = modelMapper.map(authorDto, Author.class);
        return author;
    }

    public AuthorDto authorToAuthorDto(Author author){
        AuthorDto authorDto = modelMapper.map(author, AuthorDto.class);
        return authorDto;
    }
}
