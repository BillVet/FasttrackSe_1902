package unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/loginsession"})
public class SessionLogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<form action = '/Web/loginsession' method = 'post'>");
		pw.println("Username <input type = 'text' name = 'username'>");
		pw.println("Password <input type = 'password' name = 'password'>");
		pw.println("<input type = 'submit' value = 'Login'>");
		pw.println("</form>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("A") && password.equals("1")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("/Web/welcomesession");
		}else {
			resp.sendRedirect("/Web/loginsession");
		}
	}
}
