package com.example.demo.controller;

import com.example.demo.entity.Ride;
import com.example.demo.entity.Station;
import com.example.demo.service.RideService;
import com.example.demo.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class RideController {
    @Autowired
    private RideService service;

    @PostMapping("create/ride")
    public Ride createEmployee(@RequestBody Ride ride) {
        return service.createRide(ride);
    }

    @GetMapping("get/allowEntry")
    public boolean allowEntryToRide(@RequestParam Long ticketId, @RequestParam Long rideId) {
        return service.allowEntry(ticketId, rideId);
    }

}
