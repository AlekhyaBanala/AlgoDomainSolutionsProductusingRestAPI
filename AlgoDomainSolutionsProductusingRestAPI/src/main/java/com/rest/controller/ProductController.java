package com.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.service.ProductServiceImp;

@RestController
	public class ProductController {
	@Autowired
	private ProductServiceImp service;

	@PostMapping("/save")
	public Product saveproduct(@RequestBody Product product,Charges charges){
		Product p=service.saveProduct(product, charges);
		return p;
	}
	@GetMapping("/getall")
	public List<Product> getAll(Product product){
		List<Product> p=service.getProducts(product);
		return p;
	}
	@DeleteMapping("/delete/{productId}")
	public void delete(@PathVariable int productId)
	{
		service.deleteProduct(productId);
	}
	@GetMapping("/get/{productId}")
	public Product getOneProduct( @RequestBody Product product,@PathVariable int productId)
	{
		Product getOne=service.getOneProduct(product, productId);
		return getOne;
	}
	@PutMapping("/update/{productId}")
	public Product update( @RequestBody Product product, Charges charges,@PathVariable int productId)
	{
		Product update=service.updateProduct(product, charges, productId);
		return update;
	}

	}
