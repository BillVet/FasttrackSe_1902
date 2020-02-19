package com.form.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.form.dao.UserDAO;
import com.form.model.User;
@WebServlet(urlPatterns = {"/dangnhap"})
public class UserServletControllerLogin extends HttpServlet{
	private UserDAO userDao;
	
	@Override
	public void init() throws ServletException {
		userDao= new UserDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		dangnhapUser(req, resp);
	}
	
	private void dangnhapUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		String name = userDao.dangnhap(user);
		
		if(name!=null) {
			request.setAttribute("note","dang nhap thang cong");
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", username);
			response.sendRedirect("/MVC/danhsach");
		}else {
			request.setAttribute("note","ten dang nhap hoac mat khau khong dung");
			RequestDispatcher requestDispatcher =request.getRequestDispatcher("/login.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
