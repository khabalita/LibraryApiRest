package com.khabalita.springboot.libraryApi.dto;

import com.khabalita.springboot.libraryApi.entities.Base;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorDto extends Base {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String nationality;
    private LocalDate birthdate;
    private String biography;
}
