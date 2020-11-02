package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "Name", nullable = false)
	    private String name;
	 
	    @Column(name = "Ingredients")
	    private String ingredients;
	    
	    @Column(name = "Recipe")
	    private String recipe;

//	    @Column(name = "gender")
//	    private String gender;
//	    
//	    @Column(name = "date")
//	    private String date;
//	   
//	    @Column(name = "comments")
//	    private String comments;
	   

	    public Food() {
	    }
	  	
	    public Food(String name, String ingredients, String recipe) {
	    	this.name = name;
	    	this.ingredients = ingredients;
	    	this.recipe = recipe;
//	    	this.gender = gender;
//	    	this.date = date;
//	    	this.comments = comments;
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getIngredients() {
			return ingredients;
		}

		public void setIngredients(String ingredients) {
			this.ingredients = ingredients;
		}
		
		public String getRecipe() {
			return recipe;
		}

		public void setRecipe(String recipe) {
			this.recipe = recipe;
		}
		
	    
//	    public Integer getId() {
//	        return id;
//	    }
//
//	    public void setId(Integer id) {
//	        this.id = id;
//	    }
//
//		public String getBreed() {
//			return breed;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public void setBreed(String breed) {
//			this.breed = breed;
//		}
//
//		public int getAge() {
//			return age;
//		}
//
//		public void setAge(int age) {
//			this.age = age;
//		}
//
//		public String getGender() {
//			return gender;
//		}
//
//		public void setGender(String gender) {
//			this.gender = gender;
//		}
//
//		public String getDate() {
//			return date;
//		}
//
//		public void setDate(String date) {
//			this.date = date;
//		}
//
//		public String getComments() {
//			return comments;
//		}
//
//		public void setComments(String comments) {
//			this.comments = comments;
//		}
		

}

