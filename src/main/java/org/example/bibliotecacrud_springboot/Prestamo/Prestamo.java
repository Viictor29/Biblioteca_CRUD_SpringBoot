package org.example.bibliotecacrud_springboot.Prestamo;

import jakarta.persistence.*;
import org.example.bibliotecacrud_springboot.Ejemplar.Ejemplar;
import org.example.bibliotecacrud_springboot.Usuario.Usuario;

import java.time.LocalDate;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
