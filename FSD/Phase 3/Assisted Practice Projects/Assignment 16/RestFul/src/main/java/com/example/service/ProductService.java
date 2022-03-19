package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ProductEntity;
import com.example.repo.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	ProductRepository prodrepo;
	
	public List<ProductEntity> getAllProduct()
	{
		return prodrepo.findAll();
	}
	public ProductEntity getByID(int id)
	{
		ProductEntity product=prodrepo.findById(id).get();
		return product;
	}
	public ProductEntity addProduct(ProductEntity product)
	{
		return prodrepo.save(product);
	}
	public void deleteByID(int id )
	{
		prodrepo.deleteById(id);
	}
	public ProductEntity updateProduct(int id,ProductEntity newProduct)
	{
		ProductEntity oldProduct=prodrepo.findById(id).get();
		if(prodrepo.findById(id).isPresent())
		{
			oldProduct.setName(newProduct.getName());
			oldProduct.setPrice(newProduct.getPrice());
			oldProduct.setQuantity(newProduct.getQuantity());
		}
		return oldProduct;
	}
	
}
