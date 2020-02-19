package com.form.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.BookDAO;
@WebServlet(urlPatterns = {"/deleteBook"})
public class deleteBook extends HttpServlet{

	private BookDAO bookDao;
	@Override
	public void init() throws ServletException {
		bookDao= new BookDAO();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		xoakhoidanhsach(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	protected void xoakhoidanhsach(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.valueOf( request.getParameter("id"));
		
		bookDao.delete(id);
		
		RequestDispatcher rd =request.getRequestDispatcher("/danhsach");
		rd.forward(request, response);
	}
}
