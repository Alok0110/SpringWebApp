/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.db;

import com.sim.simo.model.Ticket;
import java.util.Optional;
import org.springframework.data.gemfire.repository.GemfireRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alok
 */
@RepositoryRestResource(collectionResourceRel = "Ticket", path = "Ticket")
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    
    @Override
    public Optional<Ticket> findById(Long id);
    
}
