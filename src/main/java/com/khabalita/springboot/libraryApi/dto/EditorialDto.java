package com.khabalita.springboot.libraryApi.dto;

import com.khabalita.springboot.libraryApi.entities.Base;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EditorialDto extends Base {
    @NotBlank
    private String name;
}
