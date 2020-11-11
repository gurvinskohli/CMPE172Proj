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
	private Integer recipid;
	
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
		return "Product [Recipe_ID = " + recipid + 
				", name = " + name + ", ingredients = "
				+ ingredients + ", allergens = " + allergens + "]";
	}

	public Integer getProduct_ID() 
	{
		return recipid;
	}

	public void setProduct_ID(Integer recipid) 
	{
		this.recipid = recipid;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPrice() 
	{
		return ingredients;
	}

	public void setPrice(String ingredients) 
	{
		this.ingredients = ingredients;
	}

	public String getCategory() 
	{
		return allergens;
	}

	public void setCategory(String allergens) 
	{
		this.allergens = allergens;
	}
	
}
