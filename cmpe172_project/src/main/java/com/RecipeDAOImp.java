package com;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Recipe;

@Repository
public class RecipeDAOImp implements RecipeDAO
{
	@Autowired
	private EntityManager entityManager;
		
	@Override
	public List<Recipe> get() 
	{
		Session currSession = entityManager.unwrap(Session.class);
		
		Query<Recipe> query = currSession.createQuery("from Recipe",
				Recipe.class);
		
		List<Recipe> list = query.getResultList();
		
		return list;
	}

	@Override
	public Recipe get(int id) 
	{
		Session currSession = entityManager.unwrap(Session.class);
		
		Recipe recipe = currSession.get(Recipe.class, id);
		
		return recipe;
	}

	@Override
	public void save(Recipe recipe) 
	{
		Session currSession = entityManager.unwrap(Session.class);
		
		currSession.saveOrUpdate(recipe);
	}

	@Override
	public void delete(int id) 
	{
		Session currSession = entityManager.unwrap(Session.class);
		
		Recipe recipe = currSession.get(Recipe.class, id);
		
		currSession.delete(recipe);
	}

}
