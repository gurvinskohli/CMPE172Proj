package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service 

public class foodImplement implements foodService {

	@Autowired
    private Repository foodRepository;

    @Override
    public Iterable<Food> findAll() {
        return foodRepository.findAll();
    }
    
//    @Override
////    public Food findOne(Integer id) {
////        return foodRepository.findOne(id);
////    }
//    
//    @Override
//    public void save(Food food) {
//        foodRepository.save(food);
//    }
    
//    @Override
//    public void delete(Integer id) {
//        foodRepository.delete(id);
//    }
    
//    @Override
//    public List<Dog> search(String breed) {
//        return dogRepository.findByNameContaining(breed);
//    }
    
    @Override
    public List<Food> findByName(String name) {
        return foodRepository.findByName(name);
    }

	@Override
	public Food findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void save(Food type) {
		// TODO Auto-generated method stub
	
	}
}
