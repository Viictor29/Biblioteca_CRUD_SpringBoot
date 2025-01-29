package org.example.bibliotecacrud_springboot.Usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private int id;

    @Column (name = "dni", nullable = false, length = 9)
    @Size(max = 9, message = "El dni tendrá como máximo 9 caracteres")
    @NotNull(message = "El campo dni no puede estar vacio")
    private String dni;

    @Column (name = "nombre", nullable = false, length = 30)
    @Size(max = 30, message = "El nombre tendrá como máximo 30 caracteres")
    @NotNull(message = "El campo nombre no puede estar vacio")
    private String nombre;

    @Column (name = "email", nullable = false, length = 100)
    @Size(max = 30, message = "El mail tendrá como máximo 100 caracteres")
    @NotNull(message = "El campo email no puede estar vacio")
    private String email;

    @Column (name = "password", nullable = false)
    @NotNull(message = "El campo password no puede estar vacio")
    private String password;

    @Column (name = "tipo", nullable = false)
    @NotNull(message = "El campo tipo no puede estar vacio")
    private String tipo;

    @Column (name = "penalizacionHasta", nullable = false)
    @NotNull(message = "El campo penalizacionHasta no puede estar vacio")
    private String penalizacionHasta;
}
