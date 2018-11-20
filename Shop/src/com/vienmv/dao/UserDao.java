package com.vienmv.dao;

import java.util.List;

import com.vienmv.model.UserModel;


public interface UserDao {
	void insert(UserModel user);

	void edit(UserModel user);

	void delete(int id);

	UserModel get(String username);
	
	UserModel get(int id);

	List<UserModel> getAll();

	List<UserModel> search(String username);
}
