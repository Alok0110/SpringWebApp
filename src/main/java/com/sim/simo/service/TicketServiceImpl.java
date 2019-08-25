/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.service;

import com.sim.simo.db.TicketRepository;
import com.sim.simo.model.Ticket;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alok
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Resource
    TicketRepository ticketRepository;
    
    @Override
    public Optional<Ticket> getById(Long Id) {
       
        Optional<Ticket> t = ticketRepository.findById(1L);
        System.out.println(" ================== >");
        System.out.println(t);
        
        return t;
    }
    
    
    
}
