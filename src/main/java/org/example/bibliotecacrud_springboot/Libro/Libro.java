package org.example.bibliotecacrud_springboot.Libro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Libro {
    @Id
    private String isbn;
    private String titulo;
    private String autor;

}
