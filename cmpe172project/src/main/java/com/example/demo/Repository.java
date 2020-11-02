package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface Repository extends CrudRepository<Food, Integer> {

	List<Food> findByName(String name);


    
    

}