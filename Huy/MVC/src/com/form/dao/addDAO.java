package com.form.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.form.db.jdbcConnection;
import com.form.model.Book;
public class addDAO {
	
	public int themsach(Book book) {
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String addBook="INSERT INTO `books`(`id`,`title`, `author`, `price`, `qty`) VALUES (?,?,?,?,?)";
			PreparedStatement ps= connect.prepareStatement(addBook);
			ps.setInt(1, book.getId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setFloat(4, book.getPrice());
			ps.setInt(5, book.getQty());
			
			ps.executeUpdate();
			
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
