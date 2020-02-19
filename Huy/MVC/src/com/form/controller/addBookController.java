package com.form.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.addDAO;
import com.form.model.Book;
@WebServlet(urlPatterns = {"/addBook"})
public class addBookController extends HttpServlet {
	private addDAO add;
	
	@Override
	public void init() throws ServletException {
		add= new addDAO();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addBook(req, resp);
	}
	
	protected void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int id=Integer.valueOf(request.getParameter("id"));
		String title= request.getParameter("title");
		String author= request.getParameter("author");
		float price=Float.valueOf( request.getParameter("price"));
		int qty= Integer.valueOf(request.getParameter("qty"));
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		book.setQty(qty);
		
		add.themsach(book);
		
		response.sendRedirect("/MVC/danhsach");
	}
}
