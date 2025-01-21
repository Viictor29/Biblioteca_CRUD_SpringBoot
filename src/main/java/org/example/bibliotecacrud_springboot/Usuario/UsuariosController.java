package org.example.bibliotecacrud_springboot.Usuario;

import org.example.bibliotecacrud_springboot.Prestamo.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosController(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    //SELECT *
    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> listaUsuarios = usuariosRepository.findAll();
        return ResponseEntity.ok(listaUsuarios);
    }

    //Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getIdUsuario(@PathVariable Integer id) {
        Usuario usuario = usuariosRepository.findById(id).get();
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioPersistido = usuariosRepository.save(usuario);
        return ResponseEntity.ok(usuarioPersistido);
    }

    //Actualizar Prestamo
    @PostMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        Usuario usuarioPersistido = usuariosRepository.save(usuario);
        return ResponseEntity.ok(usuarioPersistido);
    }

    //Borrar Prestamo
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable int id) {
        usuariosRepository.deleteById(id);
        String mensaje = "Usuario con " + id + " eliminado correctamente.";
        return ResponseEntity.ok(mensaje);
    }
}
