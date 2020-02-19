package Hello_Its_Me;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/requestUrl"})
public class requestUrl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		String name = req.getParameter("name");
		pw.println("Ni Hao :" +name);
		

		String age = req.getParameter("age");
		pw.println("Ni Hao Ma :" +age);
	}
}
