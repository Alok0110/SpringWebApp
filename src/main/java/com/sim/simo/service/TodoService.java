/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.service;

import com.sim.simo.model.Todo;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author alok
 */
@Service
public interface TodoService {
    public Optional<Todo> getUser();
    public void saveTodo(Todo todoObj);
}
