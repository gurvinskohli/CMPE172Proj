package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe;
import com.RecipeService;

@RestController
@RequestMapping("/api")
public class RecipeController 
{
	@Autowired
	private RecipeService recipeService;
	
	 @GetMapping("/recipe")
	 public List<Recipe> get() 
	 {
	  return recipeService.get();
	 }
	 
	 @PostMapping("/recipe")
	 public Recipe save(@RequestBody Recipe recipe) 
	 {	 
	  recipeService.save(recipe);
	  return recipe;
	 }
	 
	 @GetMapping("/recipe/{id}")
	 public Recipe get(@PathVariable int id) 
	 {
	  return recipeService.get(id);
	 }
	 
	 @DeleteMapping("/recipe/{id}")
	 public String delete(@PathVariable int id) 
	 {
	  
	  recipeService.delete(id);
	  
	  return "Recipe removed with id "+id;
	  
	 }
	 
	 @PutMapping("/recipe")
	 public Recipe update(@RequestBody Recipe recipe) 
	 {
	  recipeService.save(recipe);
	  return recipe;
	 }
	 
}
