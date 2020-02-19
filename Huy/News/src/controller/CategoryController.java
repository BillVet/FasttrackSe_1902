package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import model.Category;

@WebServlet(urlPatterns = {"/dashboard"})

public class CategoryController extends HttpServlet{
	
	private CategoryDAO catDao;
	@Override
	public void init() throws ServletException {
		catDao = new CategoryDAO();
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			showCat(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	private void showCat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		
		List<Category> listcat = catDao.getList();
		request.setAttribute("listcat",listcat);
		
		RequestDispatcher rd =request.getRequestDispatcher("dashboard.jsp");
		rd.forward(request, response);	
	}
}
