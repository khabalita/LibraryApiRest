package com.khabalita.springboot.libraryApi.services.Impl;

import com.khabalita.springboot.libraryApi.dto.CategoryDto;
import com.khabalita.springboot.libraryApi.entities.Category;
import com.khabalita.springboot.libraryApi.mapper.CategoryMapper;
import com.khabalita.springboot.libraryApi.repository.BaseRepository;
import com.khabalita.springboot.libraryApi.repository.CategoryRepository;
import com.khabalita.springboot.libraryApi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl
        extends BaseServiceImpl<Category, CategoryDto, Long>
        implements CategoryService {

    public CategoryServiceImpl(CategoryRepository categoryRepository,
                               CategoryMapper categoryMapper){
        super(categoryRepository, categoryMapper);
    }
}
