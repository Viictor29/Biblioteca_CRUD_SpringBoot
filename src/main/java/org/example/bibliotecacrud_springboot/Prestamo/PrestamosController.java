package org.example.bibliotecacrud_springboot.Prestamo;

import org.example.bibliotecacrud_springboot.Ejemplar.Ejemplar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamosController {
    private PrestamosRepository prestamosRepository;

    @Autowired
    public PrestamosController(PrestamosRepository prestamosRepository) {
        this.prestamosRepository = prestamosRepository;
    }

    // SELECT *
    @GetMapping
    public ResponseEntity<List<Prestamo>> getPrestamos() {
        List<Prestamo> listaPrestamos = prestamosRepository.findAll();
        return ResponseEntity.ok(listaPrestamos);
    }

    //Obtener id
    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getIdPrestamo(@PathVariable int id) {
        Prestamo prestamo = prestamosRepository.findById(id).get();
        return ResponseEntity.ok(prestamo);
    }

    //Crear Prestamo
    @PostMapping("/prestamo")
    public ResponseEntity<Prestamo> crearPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo prestamoPersistido = prestamosRepository.save(prestamo);
        return ResponseEntity.ok(prestamoPersistido);
    }

    //Actualizar Prestamo
    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizarPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo prestamoPersistido = prestamosRepository.save(prestamo);
        return ResponseEntity.ok(prestamoPersistido);
    }

    //Borrar Prestamo
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPrestamo(@PathVariable int id) {
        prestamosRepository.deleteById(id);
        String mensaje = "Prestamo con " + id + " eliminado correctamente.";
        return ResponseEntity.ok(mensaje);
    }
}
