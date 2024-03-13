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
@Table(name="books")	// Spring's mapping entity to table in DB
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;

}
