package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.AuthorDto;
import com.khabalita.springboot.libraryApi.entities.Author;
import com.khabalita.springboot.libraryApi.services.AuthorService;
import com.khabalita.springboot.libraryApi.services.Impl.AuthorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api-library/authors")
public class AuthorController
        extends BaseControllerImpl<AuthorDto, Long, AuthorService>{

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        super(authorService);
        this.authorService = authorService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<AuthorDto>> findByLastName(@RequestParam String lastName){
        return ResponseEntity.ok(authorService.findByLastName(lastName));
    }

    @GetMapping("/searchString")
    public ResponseEntity<List<AuthorDto>> findByNameContainingIgnoreCase(@RequestParam String name){
        return ResponseEntity.ok(authorService.findByNameContainingIgnoreCase(name));
    }
}
