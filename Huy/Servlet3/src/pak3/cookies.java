package pak3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/cookies1"})
public class cookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		pw.println("<form action='/Servlet3/cookies1' method='post'>");
		pw.println("UserName <input type='text' name='username'>");
		pw.println("PassWord <input type='password' name='password'>");
		pw.println("<input type='submit' value='Login'>");
		pw.println("</form>");

		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Cookie cookie_user = new Cookie("username",username);
		Cookie cookie_pass = new Cookie("password",password);
		
		resp.addCookie(cookie_user);
		resp.addCookie(cookie_pass);
		
		resp.sendRedirect("/Servlet3/get_cookies");
	
	}
}
