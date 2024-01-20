package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Ride")
@Table(name = "ride")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Long minHeight;
    private String YNOpen;

    private Long employeeId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> listOfTickets;

    public Ride addTicket(Ticket ticket){
        this.listOfTickets.add(ticket);
        return this;
    }

    public boolean allowRide(Ticket ticket, Usuario usuario){
        return true;
    }
}
