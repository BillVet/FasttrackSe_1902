package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SinhVienDao;
import com.model.SinhVien;

public class SinhVienController extends HttpServlet{
	
	private SinhVienDao svDao;
	
	@Override
	public void init() throws ServletException {
		svDao = new SinhVienDao();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listSinhvien(req, resp);
		addSinhvien(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	private void listSinhvien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<SinhVien> listSinhvien = svDao.getAllSinhvien();
		req.setAttribute("listSinhvien", listSinhvien);
		RequestDispatcher rd = req.getRequestDispatcher("listSinhVien.jsp");
		rd.forward(req, resp);
	}
	
	private void addSinhvien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		
		int id = Integer.valueOf(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.valueOf(req.getParameter("age"));
		String clas = req.getParameter("clas");
		String gender = req.getParameter("gender");
		
		SinhVien sinhvien = new SinhVien(id, name, age, clas, gender);
		svDao.insert(sinhvien);
		resp.sendRedirect("/JavaWebMVC/listSinhVien");
	}
	
	private void editSinhvien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		

	}
	
	private void deleteSinhvien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		

	}
}
