package unit2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/formSV"})
public class Form extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<form action='/Servlet2/sinhvien' method='post'>");
		pw.println("Nhap Ten: <input type='text' name='name'>");
		pw.println("Nhap tuoi: <input type='text' name='age'>");
		pw.println("Nhap Dia Chi: <input type='text' name='address'>");
		pw.println("<input type='submit' value='Submit'>");
		pw.println("</form>");
		
	}
}
