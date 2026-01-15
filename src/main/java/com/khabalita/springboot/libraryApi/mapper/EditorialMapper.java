package com.khabalita.springboot.libraryApi.mapper;

import com.khabalita.springboot.libraryApi.dto.EditorialDto;
import com.khabalita.springboot.libraryApi.entities.Editorial;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditorialMapper extends BaseMapper<Editorial, EditorialDto>{

}
