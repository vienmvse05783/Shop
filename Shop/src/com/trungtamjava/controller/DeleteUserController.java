package com.trungtamjava.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trungtamjava.service.UserService;
import com.trungtamjava.service.impl.UserServiceImpl;
@WebServlet(urlPatterns= {"/admin/user/delete"})
public class DeleteUserController extends HttpServlet {
	UserService userService = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		userService.delete(Integer.parseInt(id));
		
		resp.sendRedirect(req.getContextPath() + "/admin/user/list");
	}
}
