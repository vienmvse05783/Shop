package com.vienmv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vienmv.service.UserService;
import com.vienmv.service.impl.UserServiceImpl;


@WebServlet(urlPatterns = "/register")
public class RegisterController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("view/register.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		UserService service=new UserServiceImpl();
		
	        
	        boolean isSuccess = service.register(username,password,email);
	        if(isSuccess){
	            
	            resp.sendRedirect("login");
	        }else{

	            req.getRequestDispatcher("view/register.jsp").forward(req, resp);
	        }
	    }

	}


