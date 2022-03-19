package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.example.entity.ProductEntity;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController 
{
	@Autowired
	ProductService productService;
	
	@PostMapping("/")
	public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductEntity product)
	{
		ProductEntity obj=productService.addProduct(product);
		if(obj!=null)
		{
			return new ResponseEntity<ProductEntity>(obj,HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<ProductEntity>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/")
	public List<ProductEntity> getPrductList()
	{
		return productService.getAllProduct();
	}
	@GetMapping("/{productId}")
	public ProductEntity getProductById(@PathVariable int productId )
	{
		return productService.getByID(productId);
	}
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		productService.deleteByID(productId);
	}
	@PutMapping("/{productId}")
	public ProductEntity updateById(@PathVariable int productId,@RequestBody ProductEntity product)
	{
		return productService.updateProduct(productId, product);
	}
}
