package org.example.bibliotecacrud_springboot.Libro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepository extends JpaRepository<Libro, String> {

}
