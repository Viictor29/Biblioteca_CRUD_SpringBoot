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
    @Column (name = "isbn", nullable = false, length = 20)
    @Size(max = 20, message = "EL campo isbn tendrá como máximo 9 caracteres")
    @Pattern(regexp = "^(?:\\d{3}[-\\s]?)?\\d{1,5}[-\\s]?\\d{1,7}[-\\s]?\\d{1,7}[-\\s]?\\d{1,3}[\\dX]$", message = "ISBN incorrecto")
    @NotNull(message = "El campo ISBN no puede estar vacio")
    private String isbn;


    @Column (name = "estado", nullable = false, length = 100)
    @Size(max = 100, message = "EL campo estado tendrá como máximo 100 caracteres")
    @Pattern(regexp = "^(Disponible|Prestado|Dañado)$", message = "El estado debe ser 'disponible', 'prestado' o 'dañado'")
    private String estado;

}
