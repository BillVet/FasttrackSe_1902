package com.form.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.BookDAO;
import com.form.model.Book;

@WebServlet(urlPatterns = {"/edit"})
public class editBookController extends HttpServlet {
	private BookDAO edit;
	@Override
	public void init() throws ServletException {
		edit= new BookDAO();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		editBook(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	public void editBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		float price = Float.valueOf(request.getParameter("price"));
		int qty = Integer.valueOf(request.getParameter("qty"));
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		book.setQty(qty);
		
		edit.edit(book);
		
		response.sendRedirect("/MVC/danhsach");
	}
}
