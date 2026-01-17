package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.EditorialDto;
import com.khabalita.springboot.libraryApi.entities.Editorial;
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
public class EditorialMapperImpl implements EditorialMapper {

    @Override
    public EditorialDto toDto(Editorial entity) {
        if ( entity == null ) {
            return null;
        }

        EditorialDto editorialDto = new EditorialDto();

        editorialDto.setName( entity.getName() );

        return editorialDto;
    }

    @Override
    public Editorial toEntity(EditorialDto dto) {
        if ( dto == null ) {
            return null;
        }

        Editorial.EditorialBuilder editorial = Editorial.builder();

        editorial.name( dto.getName() );

        return editorial.build();
    }

    @Override
    public List<EditorialDto> toDtoList(List<Editorial> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EditorialDto> list = new ArrayList<EditorialDto>( entities.size() );
        for ( Editorial editorial : entities ) {
            list.add( toDto( editorial ) );
        }

        return list;
    }
}
