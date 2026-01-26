package com.khabalita.springboot.libraryApi.dto.response;

import com.khabalita.springboot.libraryApi.dto.BaseDto;
import lombok.Data;

import java.util.List;

@Data
public class BookResponseDto extends BaseDto {

    private String ISBN;
    private String title;
    private String subtitle;
    private String authorName;
    private String editorialName;
    private List<String> categoriesName;
}
