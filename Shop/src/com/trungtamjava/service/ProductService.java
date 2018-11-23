package com.trungtamjava.service;

import java.util.List;

import com.trungtamjava.model.Product;

public interface ProductService {
	void insert(Product product);

	void edit(Product product);

	void delete(int id);

	Product get(int id);

	List<Product> getAll();

	List<Product> search(String username);
}
