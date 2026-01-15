package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.services.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/categories")
public class CategoryController
        extends BaseControllerImpl<CategoryDto, Long, CategoryService>{

    public CategoryController(CategoryService categoryService) {
        super(categoryService);
    }
}
