package ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import ecommerce.dao.ProductDAO;
import ecommerce.entity.ProductEntity;

@Controller
public class MainController 
{
	@Autowired
	ProductDAO productdao;									//DAO Class instance
	
	@GetMapping("/list")
	public String listProducts(ModelMap map) 
	{
		List<ProductEntity>	list=productdao.getproduts();	//Return list of products
		map.addAttribute("list", list);
		return "listproducts";		// This is JSP Page
	}
	
}
