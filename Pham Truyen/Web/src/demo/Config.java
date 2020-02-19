package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns = {"/name"},initParams = {@WebInitParam(name = "name",value = "Fasttrack Se 2020")})
public class Config extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = super.getServletConfig().getInitParameter("name");
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("Xin chao "+name);
	}
}
