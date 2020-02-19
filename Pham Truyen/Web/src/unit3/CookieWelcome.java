package unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/welcome"})
public class CookieWelcome extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		String name = "";
		
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName() != null) {
				name = c.getValue();
			}else {
				resp.sendRedirect("/Web/loginrun");
			}
		}
		
		pw.println("Xin chao: "+name);
	}
}
