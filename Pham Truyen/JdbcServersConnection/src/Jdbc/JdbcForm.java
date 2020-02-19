//package Jdbc;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(urlPatterns = {"/insert"})
//public class JdbcForm extends HttpServlet{
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html");
//
//		PrintWriter pw = resp.getWriter();
//
//		pw.println("<form action = '/JdbcServersConnection/insert' method = 'post'>");
//		pw.println("Id <input type = 'text' name = 'id'>");
//		pw.println("Name <input type = 'text' name = 'name'>");
//		pw.println("Age <input type = 'text' name = 'age'>");
//		pw.println("Class <input type = 'text' name = 'class'>");
//		pw.println("Gender <input type = 'text' name = 'gender'>");
//		pw.println("<input type = 'submit' value = 'Add'>");
//		pw.println("</form>");
//
//		pw.close();			
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html");
//		
//		int id = Integer.valueOf(req.getParameter("id"));
//		String name = req.getParameter("name");
//		int age = Integer.valueOf(req.getParameter("age"));
//		String clas = req.getParameter("class");
//		String gender = req.getParameter("gender");
//				
//		PrintWriter pw = resp.getWriter();
//		
//		Connection connection = JdbcConnection.getJdbcConnection();
//		
//		try {
//			String sql = "insert into sinhvien values(?,?,?,?,?)";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			
//			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setInt(3, age);
//			ps.setString(4, clas);
//			ps.setString(5, gender);
//			
//			ps.executeUpdate();
//			resp.sendRedirect("/JdbcServersConnection/listStudent");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}finally {
//			if(connection!=null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
