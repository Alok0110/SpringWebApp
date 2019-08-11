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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
 

    @Column(name = "description", length = 500)
    private String description;
 
 
    @Column(name = "title", nullable = false, length = 100)
    private String title;
 
    @Version
    private long version;
    
    public Todo(){
        
    }
    
    public Todo(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    //The constructor, builder, and other methods are omitted
}
