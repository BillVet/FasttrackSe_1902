package com.form.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.form.db.jdbcConnection;
import com.form.model.Book;

public class BookDAO {

	public List<Book> getList(int currentPage, int recordPage) throws IOException{
		List<Book> listBook= new ArrayList<Book>();
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String sql="select * from books limit ?,?";
			PreparedStatement stmt= connect.prepareStatement(sql);
			stmt.setInt(1, currentPage);
			stmt.setInt(2, recordPage);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setQty(rs.getInt("qty"));
				listBook.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBook;
	}




	public int getCount() throws SQLException {
		Connection connect= jdbcConnection.getJdbcConnection();
		List<Book> Listbook = new ArrayList<Book>();
		String sql = "SELECT count(id) FROM books";
		int count = 0;
		try {
			PreparedStatement stmt = connect.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}






	public int delete(int id) {
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String delete ="DELETE FROM `books` WHERE id=?";
			PreparedStatement ps= connect.prepareStatement(delete);
			ps.setInt(1, id);
			ps.executeUpdate();

			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return id;

	}
	public Book ShowEdit(int id) {
		Book book= new Book();
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String showEdit ="select * from `books` where id=?";
			PreparedStatement stmt = connect.prepareStatement(showEdit);
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setQty(rs.getInt("qty"));
			}
			connect.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return book;
	}
	public void edit(Book book) {
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String edit="UPDATE books SET title=?,author=?,price=?,qty=? WHERE id=?";
			PreparedStatement stmt = connect.prepareStatement(edit);

			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());
			stmt.setFloat(3, book.getPrice());
			stmt.setInt(4, book.getQty());
			stmt.setInt(5, book.getId());
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
