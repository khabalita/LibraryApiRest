package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.entities.Editorial;
import com.khabalita.springboot.libraryApi.services.Impl.EditorialServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/editorials")
public class EditorialController extends BaseControllerImpl<Editorial, EditorialServiceImpl>{

}
