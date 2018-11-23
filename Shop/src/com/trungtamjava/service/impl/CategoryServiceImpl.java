package com.trungtamjava.service.impl;

import java.util.List;

import com.trungtamjava.dao.CategoryDao;
import com.trungtamjava.model.Category;
import com.trungtamjava.model.User;
import com.trungtamjava.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	CategoryDao categoryDao = new CategoryDao() {
		
		@Override
		public List<Category> search(String username) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void insert(Category category) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public List<Category> getAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Category get(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void edit(Category category) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}
	};

	@Override
	public void insert(Category category) {
		categoryDao.insert(category);
	}

	@Override
	public void edit(Category category) {
//		User oldUser = userDao.get(category.getId());
//
//		oldUser.setName(newUser.getName());
//
//		userDao.edit(oldUser);
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
	}

	

	@Override
	public Category get(int id) {
		return categoryDao.get(id);
	}

	@Override
	public List<Category> getAll() {
		return categoryDao.getAll();
	}

	@Override
	public List<Category> search(String keyword) {
		return categoryDao.search(keyword);
	}

}
