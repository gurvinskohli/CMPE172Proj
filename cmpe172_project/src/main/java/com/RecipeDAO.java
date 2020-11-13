
package com;

import java.util.List;


public interface RecipeDAO 
{
	List<Recipe> get();
	
	Recipe get(int id);
	
	void save(Recipe recipe);
	
	void delete(int id);
}