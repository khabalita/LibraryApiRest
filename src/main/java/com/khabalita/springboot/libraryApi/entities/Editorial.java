package com.khabalita.springboot.libraryApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "editorials")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@SQLDelete(sql = "UPDATE editorials SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Editorial extends Base{

    @Column(name = "Name", unique = true, nullable = false)
    private String name;
}
