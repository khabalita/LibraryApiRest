package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.EditorialDto;
import com.khabalita.springboot.libraryApi.entities.Editorial;
import com.khabalita.springboot.libraryApi.mapper.EditorialMapper;
import com.khabalita.springboot.libraryApi.repository.BaseRepository;
import com.khabalita.springboot.libraryApi.repository.EditorialRepository;
import com.khabalita.springboot.libraryApi.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServiceImpl
        extends BaseServiceImpl<Editorial, EditorialDto, Long>
        implements EditorialService {

    public EditorialServiceImpl(EditorialRepository editorialRepository,
                                EditorialMapper editorialMapper){
        super(editorialRepository, editorialMapper);
    }



}
