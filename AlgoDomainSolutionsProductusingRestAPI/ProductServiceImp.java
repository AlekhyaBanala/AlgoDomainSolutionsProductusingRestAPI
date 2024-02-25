package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Charge;
import com.web.model.Products;
import com.web.repository.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo repo;

	@Override
	public Products saveProduct(Products products, Charge charge) {
		double dis = 0,gst = 0,total;
		int dcharges = 0;
		 int price= products.getBasePrice();
		if(products.getProdc().equals("Electronics"))
		{
			dis=(price*0.14)/100;
			gst=(price*0.5)/100;
			dcharges=890;
		}
		else if(products.getProdc().equals("Clothing"))
		{
			dis=(price*0.12)/100;
			gst=(price*0.24)/100;
			dcharges=800;
		}
		else if(products.getProdc().equals("Furniture"))
		{
			dis=(price*0.22)/100;
			gst=(price*0.12)/100;
			dcharges=300;
		}
		if(products.getProdc().equals("Home Appliance"))
		{
			dis=(price*0.04)/100;
			gst=(price*0.18)/100;
			dcharges=0;
		}
		total=price-dis+gst+dcharges;
		products.setDiscount(dis);
		charge.setGst(gst);
		charge.setDelivery_charges(dcharges);
		products.setFinalPrice(total);
		products.setCharge(charge);
		return repo.save(products);
		
	}

	@Override
	public List<Products> getAll(Products products) {
		List<Products>getAll=(List<Products>) repo.findAll();
		return getAll;
	}

	@Override
	public Products getOne(int prodId) {
		Products get=repo.findById(prodId).get();
		
		return get;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int prodId) {
		repo.deleteById(prodId);
	}

	@Override
	public Products update(Products products, int prodId) {
		Products oldRecord=repo.findById(prodId).get();

		oldRecord.setProdName(products.getProdName());
		
		return repo.save(products);
	}

	
	

	

	
	
}
