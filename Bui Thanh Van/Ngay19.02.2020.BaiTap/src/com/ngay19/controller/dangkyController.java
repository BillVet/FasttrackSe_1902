package com.ngay19.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ngay19.dao.dangkyDao;
import com.ngay19.model.user;
@WebServlet(urlPatterns = {"/dangky"})
public class dangkyController extends HttpServlet{
	private dangkyDao dangkyDao;
	public void init() throws ServletException {
		dangkyDao = new dangkyDao();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		dangKyUser(req, resp);
	}
    private void dangKyUser(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		user user = new user();
		user.setUsername(username);
		user.setPassword(password);
		user.setFullname(fullname);
		user.setEmail(email);
		int record = dangkyDao.dangkyUser(user);
		if(record==1) {
			req.setAttribute("NOTE", "Ban da dang ky thanh cong");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/DangNhap.jsp");
		requestDispatcher.forward(req, resp);
	}
}
