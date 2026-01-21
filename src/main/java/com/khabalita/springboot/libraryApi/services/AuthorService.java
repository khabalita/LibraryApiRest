package com.khabalita.springboot.libraryApi.services;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;

import java.util.List;

public interface AuthorService extends BaseService<AuthorDto, Long>{

    List<AuthorDto> findByLastName(String lastName);
    List<AuthorDto> findByNameContainingIgnoreCase(String name);
}
