package com.form.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.BookDAO;
import com.form.dao.addDAO;
import com.form.model.Book;
@WebServlet(urlPatterns = {"/editBook"})
public class showEditBookController extends HttpServlet{
	private BookDAO edit;

	@Override
	public void init() throws ServletException {
		edit= new BookDAO();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		showElement(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	}
	protected void showElement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.valueOf(request.getParameter("id"));
		
		Book book = edit.ShowEdit(id);
		
		request.setAttribute("book", book);

		RequestDispatcher rd =request.getRequestDispatcher("showEdit.jsp");
		rd.forward(request, response);
	}

}
