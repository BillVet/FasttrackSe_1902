package unit3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/welcomesession"})
public class SessionWelcome extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		String name = "";
		
		HttpSession session = req.getSession();
		
		Object object = session.getAttribute("username");
		
		if(name!=null) {
			name = (String) object;
		}else {
			resp.sendRedirect("/Web/loginsession");
		}
		
		pw.println("Xin chao: "+name);
		pw.println("Thoat. <a herf ='/Web/logoutsession'></a>");
	}
}
