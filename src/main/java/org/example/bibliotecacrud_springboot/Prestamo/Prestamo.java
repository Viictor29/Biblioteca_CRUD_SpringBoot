package org.example.bibliotecacrud_springboot.Prestamo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.example.bibliotecacrud_springboot.Ejemplar.Ejemplar;
import org.example.bibliotecacrud_springboot.Usuario.Usuario;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false, length = 20)
    private int id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "usuario_id") // Relación con la tabla Usuario
    private Usuario usuario;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "ejemplar_id") // Relación con la tabla Ejemplar
    private Ejemplar ejemplar;

    @Column (name = "fechaInicio", nullable = false, length = 20)
    private LocalDate fechaInicio;

    @Column (name = "fechaDevolucion", nullable = false, length = 20)
    private LocalDate fechaDevolucion;

}
