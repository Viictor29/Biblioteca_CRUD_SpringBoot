package org.example.bibliotecacrud_springboot.Usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @Pattern(regexp = "^[0-9]{8}[A-Za-z]$", message = "El DNI debe ser válido")
    private String dni;

    @Column (name = "nombre", nullable = false, length = 30)
    @Size(max = 30, message = "El nombre tendrá como máximo 30 caracteres")
    @NotNull(message = "El campo nombre no puede estar vacio")
    @Pattern(regexp =  "^[A-Z][a-zA-Z0-9 ]*$" , message = "El nombre solo debe tener valores alfanuméricos")
    private String nombre;

    @Column (name = "email", nullable = false, length = 100)
    @Size(max = 30, message = "El mail tendrá como máximo 100 caracteres")
    @NotNull(message = "El campo email no puede estar vacio")
    @Pattern(regexp = "[A-Za-z0-9]{1,50}@(gmail\\.com|gmail\\.es)" , message = "El mail debe acabar en gmail.com o gmail.es")
    private String email;

    @Column (name = "password", nullable = false)
    @NotNull(message = "El campo password no puede estar vacio")
    @Pattern(regexp = "^[A-Za-z0-9]{4,12}$", message = "La contraseña debe ser alfanumérica y tener entre 4 y 12 caracteres")
    private String password;

    @Column (name = "tipo", nullable = false)
    @NotNull(message = "El campo tipo no puede estar vacio")
    @Pattern(regexp = "^(Administrador|Normal)$", message = "El estado debe ser 'Administrador', 'Normal'")
    private String tipo;

    @Column (name = "penalizacionHasta", nullable = false)
    private String penalizacionHasta;
}
