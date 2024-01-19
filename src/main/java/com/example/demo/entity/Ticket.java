package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity(name = "Ticket")
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Usuario user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Station station;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Ride ride;

}
