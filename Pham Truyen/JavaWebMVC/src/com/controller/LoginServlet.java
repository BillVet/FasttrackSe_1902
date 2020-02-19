package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.model.User;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{
private UserDao userDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("/login");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		loginUser(req, resp);
	}
	
	private void loginUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		try {
			if(userDao.checkUser(user)) {
				HttpSession httpSession = req.getSession();
				httpSession.setAttribute("user",user);
				resp.sendRedirect("/JavaWebMVC/listSinhVien");
			}else {
				String message = "Username va password khong duoc de trong";
				req.setAttribute("message", message);
				RequestDispatcher rd = req.getRequestDispatcher("/FormLogin.jsp");
				rd.include(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

