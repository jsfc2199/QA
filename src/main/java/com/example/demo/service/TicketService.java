package com.example.demo.service;

import com.example.demo.entity.Ride;
import com.example.demo.entity.Station;
import com.example.demo.entity.Ticket;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.RideRepository;
import com.example.demo.repository.StationRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRespository;

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private StationRepository stationRepository;

    public Ticket createTicket(Ticket ticket) {
//        Usuario usuario = usuariosRepository.findById(ticket.getUserId()).get();
//        usuario.addTicket(ticket);
//
//        Station station = stationRepository.findById(ticket.getStationId()).get();
//        station.addTicket(ticket);
//
//        Ride ride = rideRepository.findById(ticket.getStationId()).get();
//        ride.addTicket(ticket);
//
//        ticketRespository.save(ticket);
//        usuariosRepository.save(usuario);
//        stationRepository.save(station);
//        rideRepository.save(ride);

        return ticket;

    }
}
