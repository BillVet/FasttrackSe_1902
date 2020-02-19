package pak3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

@WebServlet(urlPatterns = {"/get_cookies"})
public class get_cookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		Cookie cookie=null;
		Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            pw.println("Found Cookies Name and Value: ");
 
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                pw.print(" " + cookie.getName() + "--");
                pw.print("..." + cookie.getValue());
            }
        } else {
            pw.println("No cookies founds");
        }
		
		
	}
}
