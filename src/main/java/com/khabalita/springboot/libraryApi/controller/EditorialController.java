package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.EditorialDto;
import com.khabalita.springboot.libraryApi.services.EditorialService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/editorials")
public class EditorialController
        extends BaseControllerImpl<EditorialDto, Long, EditorialService>{

    public EditorialController(EditorialService editorialService) {
        super(editorialService);
    }
}
