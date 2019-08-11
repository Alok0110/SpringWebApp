/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import org.springframework.stereotype.Component;

/**
 *
 * @author alok
 */
@Entity
@Table(name = "todo")
@Component
public class Todo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 

    @Column(name = "description", length = 500)
    private String description;
 
 
    @Column(name = "title", nullable = false, length = 100)
    private String title;
 
    @Version
    private long version;
     
    //The constructor, builder, and other methods are omitted
}
