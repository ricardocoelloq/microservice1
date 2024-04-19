package com.prueba.microservice1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente extends Persona {

    private String contraseña;
    private String estado;
}