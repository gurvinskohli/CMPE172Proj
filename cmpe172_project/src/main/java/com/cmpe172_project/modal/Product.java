package com.cmpe172_project.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="recipes")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer recipe_ID;
	
	@Column
	private String name;
	
	@Column
	private String ingredients;
	
	@Column
	private String allergens;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="product")
	@JsonIgnore
	
	
	@Override
	public String toString()
	{
		return "Product [recipe_ID = " +  recipe_ID+ 
				", name = " + name + ", ingredients = "
				+ ingredients + ", allergens = " + allergens + "]";
	}
	public Integer getRecipe_ID() 
	{
		return recipe_ID;
	}

	public void setRecipe_ID(Integer recipe_ID) 
	{
		this.recipe_ID = recipe_ID;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getIngredients() 
	{
		return ingredients;
	}

	public void setIngredients(String ingredients) 
	{
		this.ingredients = ingredients;
	}

	public String getAllergens() 
	{
		return allergens;
	}

	public void setAllergens(String allergens) 
	{
		this.allergens = allergens;
	}
	
}
