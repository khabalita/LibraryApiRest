package com.khabalita.springboot.libraryApi.controller;

import com.khabalita.springboot.libraryApi.entities.Category;
import com.khabalita.springboot.libraryApi.services.Impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api-library/categories")
public class CategoryController extends BaseControllerImpl<Category, CategoryServiceImpl>{

}
