package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Entity(name = "Station")
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String YNOpen;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Employee employee;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> listOfTickets;

}
