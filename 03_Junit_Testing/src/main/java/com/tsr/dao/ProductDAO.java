package com.tsr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tsr.dto.Product;
import com.tsr.exceptions.ProductNotFoundException;
import com.tsr.helper.ConnectionManager;

public class ProductDAO {

	private ConnectionManager connectionManager;

	private final String SQL_PRODUCT_BY_ID = "select id,name,price from product where id=?";

	public ProductDAO(ConnectionManager connection) {
		super();
		this.connectionManager = connection;
	}

	public Product getProductById(int id) {
		Connection connection = null;
		ResultSet resultSet = null;
		Product product = null;
		try {
			connection = connectionManager.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement(SQL_PRODUCT_BY_ID);
			prepareStatement.setInt(1, id);
			resultSet = prepareStatement.executeQuery();
			if (resultSet.next()) {
				product = new Product();
				product.setNo(resultSet.getInt(1));
				product.setName(resultSet.getString(2));
				product.setPrice(resultSet.getInt(3));
			}else {
				throw new ProductNotFoundException("Product with No : "+id+" not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
}
