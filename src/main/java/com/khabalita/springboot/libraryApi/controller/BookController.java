package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.BookDto;
import com.khabalita.springboot.libraryApi.dto.request.BookRequestDto;
import com.khabalita.springboot.libraryApi.dto.response.BookResponseDto;
import com.khabalita.springboot.libraryApi.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api-library/books")
public class BookController
        extends BaseControllerImpl<BookDto, Long, BookService>{

    private final BookService bookService;

    public BookController(BookService bookService) {
        super(bookService);
        this.bookService = bookService;
    }

    @PostMapping("/simpleSave")
    public ResponseEntity<BookResponseDto> create(@RequestBody BookRequestDto request){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveSimple(request));
    }

    @GetMapping("/searchISBN")
    public ResponseEntity<BookDto> findBookByISBN(@RequestParam String ISBN){
        return ResponseEntity.ok(bookService.findBYISBN(ISBN));
    }

    @GetMapping("/searchAuthorName")
    public ResponseEntity<List<BookDto>> findBooksByAuthorName(@RequestParam String author){
        return ResponseEntity.ok(bookService.findBookByAuthorName(author));
    }

    @GetMapping("/searchCategories")
    public ResponseEntity<List<BookDto>> findBooksByCategories(@RequestParam String categories){
        return ResponseEntity.ok(bookService.findBookByCategories(categories));
    }
}
