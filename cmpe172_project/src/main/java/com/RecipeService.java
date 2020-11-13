package com;

import java.util.List;

import com.Recipe;

public interface RecipeService 
{
	List<Recipe> get();
	
	Recipe get(int id);
	
	void save(Recipe product);
	
	void delete(int id);
	
}
