package unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/loginrun"})
public class CookieLogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<form action = '/Web/loginrun' method = 'post'>");
		pw.println("Username <input type = 'text' name = 'username'>");
		pw.println("Password <input type = 'password' name = 'password'>");
		pw.println("<input type = 'submit' value = 'Login'>");
		pw.println("</form>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("A") && password.equals("1")) {
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/Web/welcome");
		}else {			
			resp.sendRedirect("/Web/loginrun");
		}
	}
}
