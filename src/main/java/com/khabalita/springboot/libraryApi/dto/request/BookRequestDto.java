package com.khabalita.springboot.libraryApi.dto.request;

import com.khabalita.springboot.libraryApi.dto.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class BookRequestDto extends BaseDto {

    @NotBlank
    private String ISBN;
    @NotBlank
    private String title;
    private String subtitle;
    private Long authorId;
    private Long editorialId;
    private List<Long> categoriesId;
}
