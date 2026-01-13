package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.services.Impl.AuthorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/authors")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl>{

}
