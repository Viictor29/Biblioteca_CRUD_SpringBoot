package org.example.bibliotecacrud_springboot.Prestamo;

import jakarta.persistence.*;
import lombok.Data;
import org.example.bibliotecacrud_springboot.Ejemplar.Ejemplar;
import org.example.bibliotecacrud_springboot.Usuario.Usuario;

import java.time.LocalDate;
@Data
@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usuario_id") // Relación con la tabla Usuario
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ejemplar_id") // Relación con la tabla Ejemplar
    private Ejemplar ejemplar;

    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

}
