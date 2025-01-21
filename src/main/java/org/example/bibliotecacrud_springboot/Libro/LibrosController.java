package org.example.bibliotecacrud_springboot.Libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {
    private final LibrosRepository librosRepository;

    @Autowired
    public LibrosController(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    //Get. SLECT *
    @GetMapping
    public ResponseEntity<List<Libro>> getLibros() {
        List<Libro> listaLibros = librosRepository.findAll();
        return ResponseEntity.ok(listaLibros);
    }

    // GET. SELECT BY ID
    @GetMapping("/{isbn}")
    public ResponseEntity<Libro> getLibro(@PathVariable String isbn) {
        Libro l = this.librosRepository.findById(isbn).get();
        return ResponseEntity.ok(l);
    }

    //POST. INSERT
    @PostMapping("/libro")
    public ResponseEntity<Libro> addLibro(@RequestBody Libro libro) {
        System.out.println("Entra aqui");
        Libro libroPersistido = this.librosRepository.save(libro);
        return ResponseEntity.ok(libroPersistido);
    }

    //PUT. UPDATE
    @PutMapping("/{isbn}")
    public ResponseEntity<Libro> actualizarLibro(@RequestBody Libro libro) {
        Libro libroPersistido = librosRepository.save(libro);
        return ResponseEntity.ok(libroPersistido);
    }

    //DELETE
    @DeleteMapping("/{isbn}")
    public ResponseEntity<String> deleteLibro(@PathVariable String isbn) {
        librosRepository.deleteById(isbn);
        String mensaje = "Libro con ISBN: " + isbn + " borrado correctamente.";
        return ResponseEntity.ok().body(mensaje);
    }
}
