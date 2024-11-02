package com.example.thymeleaf_ejercicio.entity;

public class Cliente {
    private String nombre; // Nombre del cliente
    private String email;  // Email del cliente
    private String tipo;   // Tipo de cliente (ej. "premium" o "regular")

    // Constructor para crear un nuevo cliente con nombre, email y tipo
    public Cliente(String nombre, String email, String tipo) {
        this.nombre = nombre; // Asigna el nombre proporcionado al atributo
        this.email = email;   // Asigna el email proporcionado al atributo
        this.tipo = tipo;     // Asigna el tipo proporcionado al atributo
    }

    // Método getter para obtener el nombre del cliente
    public String getNombre() {
        return nombre; // Devuelve el nombre del cliente
    }

    // Método setter para establecer el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el nombre al atributo
    }

    // Método getter para obtener el email del cliente
    public String getEmail() {
        return email; // Devuelve el email del cliente
    }

    // Método setter para establecer el email del cliente
    public void setEmail(String email) {
        this.email = email; // Asigna el email al atributo
    }

    // Método getter para obtener el tipo del cliente
    public String getTipo() {
        return tipo; // Devuelve el tipo del cliente
    }

    // Método setter para establecer el tipo del cliente
    public void setTipo(String tipo) {
        this.tipo = tipo; // Asigna el tipo al atributo
    }
}
