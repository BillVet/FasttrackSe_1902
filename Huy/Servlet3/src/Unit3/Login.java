package Unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();

		String username = req.getParameter("username");

		String password = req.getParameter("password");

		if(username.equals("a") && password.equals("1")) {
			RequestDispatcher rd = req.getRequestDispatcher("/wellcome");
			rd.forward(req, resp);
		}else {
			pw.println("Dang nhap that bai. Yeu cau nhap lai");
			RequestDispatcher rd = req.getRequestDispatcher("/form");
			rd.include(req, resp);
		}

	}
}
