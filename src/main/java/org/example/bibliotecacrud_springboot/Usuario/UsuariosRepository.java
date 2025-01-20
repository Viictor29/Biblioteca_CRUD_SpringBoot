package org.example.bibliotecacrud_springboot.Usuario;

import org.example.bibliotecacrud_springboot.Libro.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Libro, Integer> {

}
