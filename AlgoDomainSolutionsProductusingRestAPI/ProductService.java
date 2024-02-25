package com.web.service;

import java.util.List;

import com.web.model.Charge;
import com.web.model.Products;

public interface ProductService {
public Products saveProduct(Products products,Charge charge);
public List<Products> getAll(Products products);
public Products getOne(int prodId);
public void delete();
void delete(int prodId);
public Products update(Products products,int prodId);
}