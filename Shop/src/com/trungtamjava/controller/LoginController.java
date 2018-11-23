package com.trungtamjava.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.model.User;
import com.trungtamjava.service.UserService;
import com.trungtamjava.service.impl.UserServiceImpl;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String eString = req.getParameter("e");
		if (eString != null) {
			if (eString.equals("1")) {
				req.setAttribute("errMsg", "Sai mat khau hoac ten dang nhap");
			}
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/login.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//kiem tra login
		UserService userService = new UserServiceImpl();
		User user = userService.login(username, password);
		
		if (user != null) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("user", user);
			resp.sendRedirect(req.getContextPath() + "/dashboard");
		} else {
			resp.sendRedirect(req.getContextPath() + "/login?e=1");
		}
	}
}
