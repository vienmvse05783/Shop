package com.vienmv.service.impl;

import java.io.File;
import java.util.List;

import com.vienmv.dao.UserDao;
import com.vienmv.dao.impl.UserDaoImpl;
import com.vienmv.model.UserModel;
import com.vienmv.service.UserService;



public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();

	@Override
	public void insert(UserModel user) {
		dao.insert(user);
		
	}

	@Override
	public void edit(UserModel newUser) {
		UserModel oldUser = dao.get(newUser.getId());

		oldUser.setEmail(newUser.getEmail());
		oldUser.setUsername(newUser.getUsername());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setRoleId(newUser.getRoleId());
		if (newUser.getAvatar() != null) {
			// XOA ANH CU DI
			String fileName = oldUser.getAvatar();
			final String dir = "/Volumes/Data/files";
			File file = new File(dir + "/" + fileName);
			if (file.exists()) {
				file.delete();
			}
			// THEM ANH MOI
			oldUser.setAvatar(newUser.getAvatar());
		}

		dao.edit(oldUser);
		
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

	@Override
	public UserModel get(String username) {
		
		return dao.get(username);
	}

	@Override
	public UserModel get(int id) {
		
		return dao.get(id);
	}

	@Override
	public UserModel login(String username, String password) {
		UserModel user=this.get(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}

		return null;
		
		
	}

	@Override
	public List<UserModel> getAll() {
		
		return dao.getAll();
	}

	@Override
	public List<UserModel> search(String keyword) {
		
		return dao.search(keyword);
	}

	@Override
	public boolean register(String email, String username, String password) {
		if(dao.checkExistEmail(email)||dao.checkExistUsername(username)){
            return false;
        }
        boolean isSuccess = dao.insert(new UserModel(email, username, password));

        return isSuccess;
		

}}
