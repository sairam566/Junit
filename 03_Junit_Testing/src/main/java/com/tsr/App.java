package com.tsr;

import java.sql.SQLException;

import com.tsr.dao.ProductDAO;
import com.tsr.dto.Product;
import com.tsr.helper.ConnectionManager;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ConnectionManager connectionManager = new ConnectionManager("db.properties");
        ProductDAO dao = new ProductDAO(connectionManager);
        Product productById = dao.getProductById(5);
        System.out.println(productById);
    }
}
