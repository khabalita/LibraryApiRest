package com.khabalita.springboot.libraryApi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EditorialDto extends BaseDto {
    @NotBlank
    private String name;
}
