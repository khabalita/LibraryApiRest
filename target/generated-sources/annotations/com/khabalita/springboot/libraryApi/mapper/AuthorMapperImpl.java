package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-15T19:31:43+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDto toDto(Author entity) {
        if ( entity == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( entity.getId() );
        authorDto.setName( entity.getName() );
        authorDto.setLastName( entity.getLastName() );
        authorDto.setNationality( entity.getNationality() );
        authorDto.setBirthdate( entity.getBirthdate() );
        authorDto.setBiography( entity.getBiography() );

        return authorDto;
    }

    @Override
    public Author toEntity(AuthorDto dto) {
        if ( dto == null ) {
            return null;
        }

        Author.AuthorBuilder author = Author.builder();

        author.name( dto.getName() );
        author.lastName( dto.getLastName() );
        author.nationality( dto.getNationality() );
        author.birthdate( dto.getBirthdate() );
        author.biography( dto.getBiography() );

        return author.build();
    }

    @Override
    public List<AuthorDto> toDtoList(List<Author> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AuthorDto> list = new ArrayList<AuthorDto>( entities.size() );
        for ( Author author : entities ) {
            list.add( toDto( author ) );
        }

        return list;
    }
}
