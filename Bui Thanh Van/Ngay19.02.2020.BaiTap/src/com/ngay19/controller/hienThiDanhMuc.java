package com.ngay19.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngay19.dao.ThemDanhMucDao;
import com.ngay19.model.categories;

@WebServlet(urlPatterns = {"/hienthidanhmuc"})
public class hienThiDanhMuc extends HttpServlet{
	private ThemDanhMucDao themDanhMucDao;
	 
	 @Override
	public void init() throws ServletException {
		 themDanhMucDao = new ThemDanhMucDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<categories> listDanhSachDanhMuc = themDanhMucDao.categories();
		req.setAttribute("list", listDanhSachDanhMuc);
       RequestDispatcher rd = req.getRequestDispatcher("/GiaoDienAdmin.jsp");
       rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
