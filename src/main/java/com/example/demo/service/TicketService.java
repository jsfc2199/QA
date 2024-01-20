package com.example.demo.service;

import com.example.demo.entity.Ticket;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.TicketRepository;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRespository;

    @Autowired
    private UsuariosRepository usuariosRepository;


    public Ticket createTicket(Ticket ticket) {
        Usuario usuario = usuariosRepository.findById(ticket.getUserId()).get();
        usuario.addTicket(ticket);

        ticketRespository.save(ticket);
        usuariosRepository.save(usuario);
        return ticket;

    }
}
