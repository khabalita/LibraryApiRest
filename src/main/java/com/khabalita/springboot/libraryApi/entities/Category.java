package com.khabalita.springboot.libraryApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@SQLDelete(sql = "UPDATE Categories SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Category extends Base{

    @Column(name = "Name", unique = true, nullable = false)
    private String name;
}
