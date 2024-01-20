package com.example.demo.controller;

import com.example.demo.entity.Ticket;
import com.example.demo.entity.Usuario;
import com.example.demo.service.TicketService;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("create/ticket")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }
}
