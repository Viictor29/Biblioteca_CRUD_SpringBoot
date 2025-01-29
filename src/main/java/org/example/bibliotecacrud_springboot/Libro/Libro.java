package org.example.bibliotecacrud_springboot.Libro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.aspectj.bridge.IMessage;
import org.checkerframework.checker.units.qual.A;

@Data
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @NotBlank(message = "El campo ISBN no puede estar vacio")
    @Size(max = 20)
    @Pattern(regexp = "^(?:\\d{3}[-\\s]?)?\\d{1,5}[-\\s]?\\d{1,7}[-\\s]?\\d{1,7}[-\\s]?\\d{1,3}[\\dX]$", message = "ISBN con 4 mayusculas")
    @Column (name = "isbn", nullable = false, length = 20)
    private String isbn;

    @NotNull(message = "El campo titulo no puede estar vacio")
    @Size(max = 200, message = "El titulo como máximo puede tener 200 caracteres")
    @Pattern(regexp =  "^[A-Z][a-zA-Z0-9 ]*$" , message = "La primera letra del título debe ser en mayusculas y solo caracteres alfanuméricos")
    @Column (name = "titulo", nullable = false, length = 200)
    private String titulo;

    @Size(max = 100, message = "El titulo como máximo puede tener 100 caracteres")
    @NotNull(message = "El campo autor no puede estar vacio")
    @Pattern(regexp = "^[A-Z][a-zA-Z0-9 ]*$" , message = "La primera letra del autor debe ser en mayusculas y solo caracteres alfanuméricos")
    @Column (name = "autor", nullable = false, length = 100)
    private String autor;

}
