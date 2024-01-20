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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    @Autowired
    private StationService stationService;

    public Ticket createTicket(Ticket ticket) {
        Station station = stationRepository.findById(ticket.getStationId()).get();
        station.addTicket(ticket);

        if(!stationService.isEnabled(station)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estacion está cerrada");
        };

        Usuario usuario = usuariosRepository.findById(ticket.getUserId()).get();
        usuario.addTicket(ticket);

        Ride ride = rideRepository.findById(ticket.getRideId()).get();
        ride.addTicket(ticket);

        ticketRespository.save(ticket);
        usuariosRepository.save(usuario);
        rideRepository.save(ride);
        stationRepository.save(station);
        return ticket;
    }


}
