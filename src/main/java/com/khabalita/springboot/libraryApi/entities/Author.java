package com.khabalita.springboot.libraryApi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "authors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class Author extends Base{

    @Column(name = "Name")
    private String name;
    @Column(name = "Lastname")
    private String lastName;
    @Column(name = "Nac")
    private String nationality;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Birthdate")
    private LocalDate birthdate;
    @Column(name = "Biography")
    private String biography;

}
