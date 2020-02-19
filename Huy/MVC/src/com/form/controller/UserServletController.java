package com.form.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.UserDAO;
import com.form.model.User;

@WebServlet(urlPatterns = {"/dangky"})
public class UserServletController extends HttpServlet{
	private UserDAO userDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dangkyUser(req, resp);
	}
	
	private void dangkyUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		int record = userDao.dangki(user);
		if(record==1) {
			request.setAttribute("note","dang ki thang cong");
			
			response.sendRedirect("login.jsp");
		}
		
		
	}
	
}
