package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends BaseMapper<Author, AuthorDto>{

}
