package com.vienmv.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.vienmv.dao.ProductDao;
import com.vienmv.jdbc.DbContext;
import com.vienmv.model.ProductModel;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void insert(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(ProductModel product) {
		String sql = "UPDATE Product SET pro_name = ? , origin_price = ?, sale_price = ?,quantity=? ,cate_id = ? ,pro_size = ? ,pro_desc = ? WHERE pro_id = ?";
		Connection conn = DbContext.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, product.getPro_name());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void delete(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductModel getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> getByName(String pro_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
