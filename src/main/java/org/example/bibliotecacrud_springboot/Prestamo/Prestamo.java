package org.example.bibliotecacrud_springboot.Prestamo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int usuario_id;
    private int ejemplar_id;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
}
