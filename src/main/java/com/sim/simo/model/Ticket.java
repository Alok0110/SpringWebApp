/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

/**
 *
 * @author alok
 */
@Region("Ticket")
public class Ticket implements Serializable {
 
   private static AtomicLong COUNTER = new AtomicLong(0L);

	@org.springframework.data.annotation.Id
	private Long id;

    public static AtomicLong getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(AtomicLong COUNTER) {
        Ticket.COUNTER = COUNTER;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	private String firstName;
	private String lastName;

	@PersistenceConstructor
	public Ticket() {
		this.id = COUNTER.incrementAndGet();
	}
    
}
