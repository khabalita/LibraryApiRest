package com.khabalita.springboot.libraryApi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

    //Agregado un nuevo comentario
@Data
public class AuthorDto {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String nationality;
    private LocalDate birthdate;
    private LocalDate deathdate;
    private String biography;
}
