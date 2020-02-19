package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.UserDao;
import com.model.User;

@WebServlet(urlPatterns = {"/dangKy"})

public class UserServletController extends HttpServlet{

	private UserDao userDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("/dangKy");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dangKyUser(req, resp);
	}
	
	private void dangKyUser(HttpServletRequest request,HttpServletResponse resp) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		int record = userDao.dangkyUser(user);
		if(record==1) {
			request.setAttribute("NOTE", "Ban da dang ky thanh cong");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/FormDangky.jsp");
		rd.forward(request, resp);
	}
}
