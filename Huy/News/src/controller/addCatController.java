package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import model.Category;

@WebServlet(urlPatterns = {"/addCat"})
public class addCatController extends HttpServlet {
	private CategoryDAO addCat;
	
	@Override
	public void init() throws ServletException {
		addCat = new CategoryDAO();
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addCat(req, resp);
	}
	protected void addCat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int category_id = Integer.valueOf(req.getParameter("category_id"));
		String category_name= req.getParameter("category_name");
		
		Category cat = new Category();
		cat.setCategory_id(category_id);
		cat.setCategory_name(category_name);
		
		addCat.addCat(cat);
		
		resp.sendRedirect("/News/dashboard");
	}

}
