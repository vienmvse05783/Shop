package com.vienmv.service;

import java.util.List;


import com.vienmv.model.UserModel;

public interface UserService {

	void insert(UserModel user);

	void edit(UserModel user);

	void delete(int id);

	UserModel get(String username);
	
	UserModel get(int id);
	
	UserModel login(String username, String password);
	
	boolean register(String email,String username, String password);

	List<UserModel> getAll();

	List<UserModel> search(String keyword);
}
