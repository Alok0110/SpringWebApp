/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.service;

import com.sim.simo.db.TodoRepository;
import com.sim.simo.model.Todo;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alok
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Resource
    TodoRepository todoRepository;
    
    /*@Autowired
    public void setTodoRepository(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }*/
    
    @Transactional
    @Override
    public Optional<Todo> getUser() {
        Optional<Todo> str = todoRepository.findById(1L);
        
        return str;
    }

    @Override
    public void saveTodo(Todo todoObj) {
        
        todoRepository.saveAndFlush(todoObj);
        
    }

    
    
    
    
    
}
