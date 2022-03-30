package com.project.SportyShoes.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String category;
	private long price;
	private String status;
	private String size;
	public Product() 
	{
		super();
	}
	public Product(long id, String productName, String category, long price, String status, String size) 
	{
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.status = status;
		this.size = size;
	}	
	public long getId() 
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public long getPrice()
	{
		return price;
	}
	public void setPrice(long price)
	{
		this.price = price;
	}
	
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+ ", status=" + status + ", size=" + size + "]";
	}
}
