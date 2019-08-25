/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.service;

/**
 *
 * @author alok
 */

/*

abstract 	assert 	     boolean 	break
byte 	        case 	     catch 	char
class 	        const 	     continue 	default
do 	        double 	     else 	enum 
extends 	final 	     finally 	float
for 	        goto 	     if 	implements
import 	        instanceof   int 	interface
long 	        native 	     new 	package
private 	protected    public 	return
short 	        static 	     strictfp 	super
switch 	        synchronized this 	throw
throws 	        transient    try 	void
volatile 	while

*/

public class ProcOne {
    
    
    public static void main(String[] args){
        Proc1 p1 = new Proc2();
        Proc1 p2 = new Proc3();
        
        System.out.println("This is object Proc2 ");
        p1.someMeth();
        p1.someMeth2();
        System.out.println("This is object Proc3 ");
        p2.someMeth();
        p2.someMeth2();
        
    }

   
    
}
