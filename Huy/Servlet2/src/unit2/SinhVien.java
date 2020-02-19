package unit2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/sinhvien"})
public class SinhVien extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String name = req.getParameter("name");
		pw.println("Ten :" +name);
		String age = req.getParameter("age");
		pw.println("Tuoi :" +age);
		String address = req.getParameter("address");
		pw.println("Ni Hao :" +address);
	}
}
