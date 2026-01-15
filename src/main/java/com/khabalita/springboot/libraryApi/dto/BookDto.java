package com.khabalita.springboot.libraryApi.dto;

import com.khabalita.springboot.libraryApi.entities.Base;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class BookDto extends Base {
    @NotBlank
    private String ISBN;
    @NotBlank
    private String title;
    @NotBlank
    private String subTitle;
    @NotBlank
    private Long edition;
    private AuthorDto authorDto;
    private EditorialDto editorialDto;
    private List<CategoryDto> categoryDto;
}
