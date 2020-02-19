package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.dao.UserDao;

public class UserController extends HttpServlet{

	private UserDao userDao;
	
	@Override
	public void init(){
		userDao = new UserDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		loginUser(req, resp);
	}
	
	private void loginUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		if(userDao.loginCheck(user)) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("user", user);
			resp.sendRedirect("/Project/index");
		}else {
			String message = "UserName va Password khong hop le";
			req.setAttribute("message", message);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Login.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
