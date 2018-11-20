package com.vienmv.dao;

import java.util.List;

import com.vienmv.model.ProductModel;



public interface ProductDao {
	void insert(ProductModel product);
	void edit(ProductModel product);
	void delete(ProductModel product);
	ProductModel getById(int id);
	List<ProductModel> getByName(String pro_name);
	List<ProductModel> getAll();
	

}
