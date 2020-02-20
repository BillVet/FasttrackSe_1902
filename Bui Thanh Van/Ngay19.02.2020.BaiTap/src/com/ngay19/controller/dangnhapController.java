package com.ngay19.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngay19.dao.dangnhapDao;
import com.ngay19.model.user;
@WebServlet(urlPatterns = {"/dangnhap"})
public class dangnhapController extends HttpServlet{
	private dangnhapDao dangNhapDao;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		dangNhapDao = new dangnhapDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		user user = new user();
		user.setUsername(username);
		user.setPassword(password);
		int record = dangNhapDao.dangnhapUser(user);
		if(record == 1) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/hienthinhanvien");
			requestDispatcher.forward(req, resp);
		} else {
			req.setAttribute("NOTE1", "Vui lòng kiểm tra lại!");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/DangNhap.jsp");
			requestDispatcher.include(req, resp);
		}
		
	}
}
