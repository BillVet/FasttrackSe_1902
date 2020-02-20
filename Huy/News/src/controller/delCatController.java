package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;



@WebServlet(urlPatterns = {"/deleteCat"})
public class delCatController extends HttpServlet{

	private CategoryDAO catDao;
	@Override
	public void init() throws ServletException {
		catDao= new CategoryDAO();
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
		
		catDao.delete(id);
		
		RequestDispatcher rd =request.getRequestDispatcher("/dashboard");
		rd.forward(request, response);
	}
}
