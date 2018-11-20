package com.vienmv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        
        if(session!=null&&session.getAttribute("username")!=null){
            response.sendRedirect("/home");
            return;
        }
        
        
        //Check cookie
        Cookie [] cookies = request.getCookies();
        
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    
                    session = request.getSession(true);
                    session.setAttribute("username", cookie.getValue());                    
                    response.sendRedirect("/home");
                    return;
                }
            }
       
        }
        
        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}

}
