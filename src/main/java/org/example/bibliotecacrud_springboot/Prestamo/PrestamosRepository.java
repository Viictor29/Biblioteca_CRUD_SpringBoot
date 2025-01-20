package org.example.bibliotecacrud_springboot.Prestamo;

import org.example.bibliotecacrud_springboot.Libro.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamosRepository extends JpaRepository<Libro, Integer> {

}