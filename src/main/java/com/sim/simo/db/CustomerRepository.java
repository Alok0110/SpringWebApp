/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.db;

/**
 *
 * @author alok
 */
import com.sim.simo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
 
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Customer findByFirstname(@Param("firstname") String firstname);
    Customer findByLastname(@Param("lastname") String lastname);
    Iterable<Customer> findByAgeGreaterThan(@Param("age") int age);
    Iterable<Customer> findByAgeLessThan(@Param("age") int age);
}
