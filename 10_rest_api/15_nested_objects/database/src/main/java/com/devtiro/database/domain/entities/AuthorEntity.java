package com.devtiro.database.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data					// Lombok basic annotations
@AllArgsConstructor		// Lombok creates constructor
@NoArgsConstructor		// Lombok creates constructor
@Builder				// Lombok creates object builder
@Entity					// Spring's JPA Entity - Each instance of the class represents a row in the table.
@Table(name="authors")	// Spring's mapping entity to table in DB
public class AuthorEntity {

    @Id					// Marks the id field as the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq") //We can generate the identifiers in different ways, which are specified by the @GeneratedValue annotation.We can choose from four id generation strategies with the strategy element. The value can be AUTO, TABLE, SEQUENCE, or IDENTITY:


    private Long id;

    private String name;

    private Integer age;

}
