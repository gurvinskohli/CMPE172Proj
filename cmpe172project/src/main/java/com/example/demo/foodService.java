package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface foodService {
	Iterable<Food> findAll();
    //find one dog by its id
    Food findOne(Integer id);
    //delete a dog using id
    void delete(Integer id);
    //save
    void save(Food type);
    //search by breed
    List<Food> findByName(String type);
	

}

