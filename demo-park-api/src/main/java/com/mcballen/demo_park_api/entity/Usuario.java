package com.mcballen.demo_park_api.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username", nullable = false,unique = true,length = 100)
    private String username;

    @Column(name = "password",nullable = false,length = 200)
    private String passoword;
    @Enumerated(EnumType.STRING)

    @Column(name = "role", nullable = false,length = 25)
    private Role role;


    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
    @Column(name = "data_modificacao")
    private LocalDateTime dataModificacao;
    @Column(name = "criado_por")
    private String criadoPor;
    @Column(name = "modificado_por")
    private String modificadoPor;


    public enum Role{
        Role_ADMIN, ROLE_CLIENTE
    }
}
