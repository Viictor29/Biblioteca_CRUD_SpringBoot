package org.example.bibliotecacrud_springboot.Ejemplar;

import org.example.bibliotecacrud_springboot.Libro.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjemplaresRepository extends JpaRepository<Libro, String> {

}