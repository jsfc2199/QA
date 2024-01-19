package com.example.demo.repository;

import com.example.demo.entity.Ticket;
import com.example.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
