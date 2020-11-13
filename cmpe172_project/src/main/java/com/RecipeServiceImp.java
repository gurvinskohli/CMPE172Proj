package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RecipeDAO;
import com.Recipe;

@Service
public class RecipeServiceImp implements RecipeService
{
	@Autowired
	private RecipeDAO recipeDao;
	
	@Transactional
	@Override
	public List<Recipe> get() 
	{
		return recipeDao.get();
	}

	@Transactional
	@Override
	public Recipe get(int id) 
	{
		return recipeDao.get(id);
	}

	@Transactional
	@Override
	public void save(Recipe product) 
	{
		recipeDao.save(product);
	}

	@Transactional
	@Override
	public void delete(int id) 
	{
		recipeDao.delete(id);
	}

}
