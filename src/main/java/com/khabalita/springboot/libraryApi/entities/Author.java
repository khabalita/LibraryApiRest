package com.khabalita.springboot.libraryApi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDate;

@Entity
@Table(name = "authors", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Name", "Lastname"})
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
@SQLDelete(sql = "UPDATE authors SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
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
