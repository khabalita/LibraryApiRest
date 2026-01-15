package com.khabalita.springboot.libraryApi.dto;


import com.khabalita.springboot.libraryApi.entities.Base;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryDto extends Base {
    @NotBlank
    private String name;
}
