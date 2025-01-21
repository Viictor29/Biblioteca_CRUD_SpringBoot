package org.example.bibliotecacrud_springboot.Ejemplar;

import org.example.bibliotecacrud_springboot.Libro.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ejemplares")
public class EjemplaresController {
    private EjemplaresRepository ejemplaresRepository;

    @Autowired
    public EjemplaresController(EjemplaresRepository ejemplaresRepository) {
        this.ejemplaresRepository = ejemplaresRepository;
    }

    //Seletc * from
    @GetMapping
    public ResponseEntity<List<Ejemplar>> getEjemplares() {
        List<Ejemplar> listaEjemplares = ejemplaresRepository.findAll();
        return ResponseEntity.ok(listaEjemplares);
    }

    //Obtener id
    @GetMapping("/{id}")
    public ResponseEntity<Ejemplar> getIdEjemplar(@PathVariable int id) {
        Ejemplar ejemplar = ejemplaresRepository.findById(id).get();
        return ResponseEntity.ok(ejemplar);
    }

    //Crear ejemplar
    @PostMapping("/ejemplar")
    public ResponseEntity<Ejemplar> addLibro(@RequestBody Ejemplar ejemplar) {
        Ejemplar ejemplarPersistido = ejemplaresRepository.save(ejemplar);
        return ResponseEntity.ok(ejemplarPersistido);
    }

    //Actualizar Ejemplar
    @PutMapping("/{id}")
    public ResponseEntity<Ejemplar> actualizarEjemplar(@RequestBody Ejemplar ejemplar) {
        Ejemplar ejemplarPersistido = ejemplaresRepository.save(ejemplar);
        return ResponseEntity.ok(ejemplarPersistido);
    }

    //Borrar Ejemplar
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEjemplar(@PathVariable int id) {
        ejemplaresRepository.deleteById(id);
        String mensaje = "Ejemplar con id " + id + " eliminado correctamente.";
        return ResponseEntity.ok(mensaje);
    }
}
