/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.controller;

import com.sim.simo.model.Todo;
import com.sim.simo.service.TodoService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alok
 */
@Component
@RestController
public class MainController {
    
    @Autowired
    TodoService todoService;
    
    
    @RequestMapping(path = "/strP", method = RequestMethod.GET)
    public void getTodo(){
        Optional<Todo> opt = todoService.getUser();
        
        System.out.println("Print this message ==> ");
        System.out.println(((Todo) opt.get()).getTitle());
    }
    
    @RequestMapping(path = "/saveData", method = RequestMethod.GET)
    public void saveDummyData(){
        Todo todoObj = new Todo("SomeTitle","This is the description");
        todoService.saveTodo(todoObj);
    }
    
}
