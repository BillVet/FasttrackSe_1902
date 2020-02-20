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
import com.ngay19.dao.quanLyThanhVien;
import com.ngay19.model.user;
@WebServlet(urlPatterns = {"/hienthinhanvien"})
public class hienThiNhanVien extends HttpServlet{
	private quanLyThanhVien quanLyThanhVien;
	 
	 @Override
	public void init() throws ServletException {
		 quanLyThanhVien = new quanLyThanhVien();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<user> listNhanVien = quanLyThanhVien.user();
		req.setAttribute("listnv", listNhanVien);
      RequestDispatcher rd = req.getRequestDispatcher("/hienthidanhmuc");
      rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
