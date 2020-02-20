package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import connection.jdbcConnection;
import model.Category;



public class CategoryDAO {
	public List<Category> getList() throws IOException{
		List<Category> listCat = new ArrayList<Category>();
		try {
			Connection connect = jdbcConnection.getJdbcConnection();
			String sql="select * from categories";
			PreparedStatement sttm = connect.prepareStatement(sql);
			ResultSet rs = sttm.executeQuery();
			
			while(rs.next()) {
				Category cat = new Category();
				cat.setCategory_id(rs.getInt("category_id"));
				cat.setCategory_name(rs.getString("category_name"));
				listCat.add(cat);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listCat;
	}
	
	public int delete(int id) {
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String delete ="DELETE FROM `categories` WHERE category_id=?";
			PreparedStatement ps= connect.prepareStatement(delete);
			ps.setInt(1, id);
			ps.executeUpdate();

			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return id;

	}
	
	
	public int addCat(Category cat) {
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String add="INSERT INTO `categories`(`category_id`,`category_name`) VALUES (?,?)";
			PreparedStatement ps= connect.prepareStatement(add);
			ps.setInt(1, cat.getCategory_id());
			ps.setString(2, cat.getCategory_name());
			ps.executeUpdate();
			
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
