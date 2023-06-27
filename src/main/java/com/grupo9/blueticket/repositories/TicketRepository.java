package com.grupo9.blueticket.repositories;

import com.grupo9.blueticket.models.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
    

}
