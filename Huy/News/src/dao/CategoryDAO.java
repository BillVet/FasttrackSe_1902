package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
