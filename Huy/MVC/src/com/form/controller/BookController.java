package com.form.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.form.dao.BookDAO;
import com.form.dao.UserDAO;
import com.form.model.Book;

@WebServlet(urlPatterns = {"/danhsach"})
public class BookController extends HttpServlet{
	private BookDAO bookDao;
	@Override

	public void init() throws ServletException {
		bookDao= new BookDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			showBook(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	private void showBook(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException, SQLException{
		
		int currentPage =1;
		int recordPerPage = 3;

		if(request.getParameter("currentPage")!= null) { 
			currentPage = Integer.valueOf(request.getParameter("currentPage"));}
			
			List<Book> listBook = bookDao.getList((currentPage-1)*recordPerPage, recordPerPage);
			request.setAttribute("listBook", listBook);

			int rows = bookDao.getCount();

			int noOfPages = rows/recordPerPage;

			if(noOfPages % recordPerPage> 0) {
				noOfPages++;
			}
			request.setAttribute("noOfPage", noOfPages);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("recordPerPage", recordPerPage);

			RequestDispatcher rd =request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);	
		}
	}


