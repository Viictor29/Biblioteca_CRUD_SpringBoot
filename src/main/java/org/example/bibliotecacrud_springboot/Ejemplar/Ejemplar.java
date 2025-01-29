package org.example.bibliotecacrud_springboot.Ejemplar;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "ejemplar")
public class Ejemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false, length = 20)
    private int id;

    @NotBlank(message = "El campo ISBN no puede estar vacio")
    @Column (name = "isbn", nullable = false, length = 9)
    @Size(max = 9, message = "EL campo isbn tendrá como máximo 9 caracteres")
    @Pattern(regexp = "[A-Z]{4}", message = "ISBN con 4 mayusculas")
    @NotNull(message = "El campo ISBN no puede estar vacio")
    private String isbn;


    @Column (name = "estado", nullable = false, length = 100)
    @Size(max = 100, message = "EL campo estado tendrá como máximo 100 caracteres")
    private String estado;

}
