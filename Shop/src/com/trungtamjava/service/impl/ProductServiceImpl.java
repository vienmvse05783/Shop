package com.trungtamjava.service.impl;

import java.io.File;
import java.util.List;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.UserDao;
import com.trungtamjava.dao.impl.ProductDaoImpl;
import com.trungtamjava.dao.impl.UserDaoImpl;
import com.trungtamjava.model.Product;
import com.trungtamjava.model.User;
import com.trungtamjava.service.ProductService;
import com.trungtamjava.service.UserService;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao = new ProductDaoImpl();

	@Override
	public void insert(Product product) {
		productDao.insert(product);
		
	}

	@Override
	public void edit(Product product) {
		
		
	}

	@Override
	public void delete(int id) {
		productDao.delete(id);
		
	}

	@Override
	public Product get(int id) {
		
		return productDao.get(id);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public List<Product> search(String product) {
		// TODO Auto-generated method stub
		return productDao.search(product);
	}

}
