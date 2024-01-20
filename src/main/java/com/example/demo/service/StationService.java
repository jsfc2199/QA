package com.example.demo.service;

import com.example.demo.entity.Ride;
import com.example.demo.entity.Station;
import com.example.demo.repository.RideRepository;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    public Station createStation(Station station) {
        stationRepository.save(station);
        return station;
    }
}
