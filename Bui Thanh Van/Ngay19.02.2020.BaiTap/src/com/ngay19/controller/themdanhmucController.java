package com.ngay19.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngay19.dao.ThemDanhMucDao;
import com.ngay19.model.categories;


@WebServlet(urlPatterns = {"/themdanhmuc"})
public class themdanhmucController extends HttpServlet{
	private ThemDanhMucDao themDanhMucDao;
	public void init() throws ServletException {
		themDanhMucDao = new ThemDanhMucDao();
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
		
		String category_id = req.getParameter("category_id");
		String category_name = req.getParameter("category_name");

		categories categories = new categories();
		categories.setCategory_id(Integer.parseInt(category_id));;
		categories.setCategory_name(category_name);
		int record = themDanhMucDao.themDanhMuc(categories);
//		if(record==1) {
//			req.setAttribute("NOTE", "Ban da dang ky thanh cong");
//		}
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/DangNhap.jsp");
//		requestDispatcher.forward(req, resp);
	}
}
