/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.db;

import com.sim.simo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alok
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    //@Query("SELECT t.title FROM Todo t where t.id = :id") 
    //String findTitleById(@Param("id") Long id);

    
}
