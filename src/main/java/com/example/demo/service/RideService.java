package com.example.demo.service;

import com.example.demo.entity.Ride;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    public Ride createRide(Ride ride) {
        rideRepository.save(ride);
        return ride;
    }
}
