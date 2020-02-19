package pak4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/session"})
public class Seccion extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		pw.println("<form action='/Servlet3/session' method='post'>");
		pw.println("UserName <input type='text' name='username'>");
		pw.println("PassWord <input type='password' name='password'>");
		pw.println("<input type='submit' value='Login'>");
		pw.println("</form>");

		pw.close();
	}
}
