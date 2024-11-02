package com.example.thymeleaf_ejercicio.controller;

import com.example.thymeleaf_ejercicio.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    // Maneja la raíz (/) y redirige a /clientes
    @GetMapping("/")
    public String home() {
        return "redirect:/clientes"; // Redirige a la lista de clientes
    }

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        // Inicialización de clientes para demostración
        if (clientes.isEmpty()) {
            clientes.add(new Cliente("Carlos", "carlos@mail.com", "premium"));
            clientes.add(new Cliente("Ana", "ana@mail.com", "regular"));
        }
        // Se agrega la lista de clientes al modelo, que Thymeleaf utilizará para renderizar la vista.
        model.addAttribute("clientes", clientes); // Thymeleaf utilizará este atributo para iterar y mostrar en la tabla.
        return "clientes"; // Retorna el nombre de la vista a renderizar (clientes.html), donde Thymeleaf procesará el HTML.
    }

    @GetMapping("/clientes/nuevo")
    public String nuevoCliente(Model model) {
        // Se crea un nuevo objeto Cliente vacío y se agrega al modelo.
        // Este objeto se usará en la vista para enlazar los campos del formulario.
        model.addAttribute("cliente", new Cliente("", "", "")); // Thymeleaf enlazará este objeto con el formulario en nuevo_cliente.html.
        return "nuevo_cliente"; // Retorna el nombre de la vista a renderizar (nuevo_cliente.html), donde Thymeleaf procesará el HTML.
    }

    @PostMapping("/clientes/guardar")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        // Agrega el nuevo cliente a la lista.
        // Este objeto 'cliente' fue creado a partir del formulario y enlazado a través de Thymeleaf.
        clientes.add(cliente); // Thymeleaf envía los datos del formulario que se guardan aquí.
        return "redirect:/clientes"; // Redirige a la lista de clientes después de guardar.
    }
}
