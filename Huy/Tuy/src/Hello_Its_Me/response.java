package Hello_Its_Me;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/xinchao"})
public class response extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1 style='color:blue; text-align:center'>may khong thoat duoc dau con trai</h1>");
		pw.println("<h2 style='text-align:center'>tu be khong tinh iu</h2>");
	}
}
