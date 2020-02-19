package unit2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form"})
public class Formvd1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<form action = '/Web/thongtin' method = 'post'>");
		pw.println("Nhap ten: <input type = 'text' name = 'name'>");
		pw.println("Nhap tuoi: <input type = 'text' name = 'age'>");
		pw.println("Nhap dia chi: <input type = 'text' name = 'address'>");
		pw.println("Submit <input type = 'submit' value = 'sumit'>");
		pw.println("</form>");
	}
}
