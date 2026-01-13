package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.EditorialDto;
import com.khabalita.springboot.libraryApi.entities.Editorial;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialMapper {
    @Autowired
    private ModelMapper modelMapper;
    public Editorial editorialDtoToEditorial(EditorialDto editorialDto){
        Editorial editorial = modelMapper.map(editorialDto, Editorial.class);
        return editorial;
    }

    public EditorialDto editorialToEditorialDto(Editorial editorial){
        EditorialDto editorialDto = modelMapper.map(editorial, EditorialDto.class);
        return editorialDto;
    }

}
