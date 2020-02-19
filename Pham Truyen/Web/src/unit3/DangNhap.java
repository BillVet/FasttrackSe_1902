package unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/dangNhap"})
public class DangNhap extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("A") && password.equals("1")) {
			RequestDispatcher rd = req.getRequestDispatcher("/xinChao");
			rd.forward(req, resp);
		}else {
			pw.println("<h3 style = 'color:red'> Dang nhap sai! Moi thuc hien lai. </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/login");
			rd.include(req, resp);
		}
	}
}
