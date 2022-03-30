package com.project.SportyShoes.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categories")
public class Categories
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String categoryName;	
	public Categories() 
	{
		
	}
	public Categories(long id, String categoryName) 
	{
		this.id = id;
		this.categoryName = categoryName;
	}
	@Override
	public String toString() 
	{
		return "Categories [id=" + id + ", categoryName=" + categoryName + "]";
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getCategoryName() 
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}
}
