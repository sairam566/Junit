package com.tsr.dao;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tsr.dto.Product;
import com.tsr.helper.ConnectionManager;
import com.tsr.helper.SchemaHelper;

public class ProductDaoTest {
	
	static SchemaHelper schemaHelper = null;
	static ConnectionManager connectionManager = null;
	static ConnectionManager rootConnectionManager = null;
	static SchemaHelper rootSchemaHelper = null;
	
	@BeforeClass
	public static void startUp() throws IOException, SQLException {
		rootConnectionManager = new ConnectionManager("db-root.properties");
		rootSchemaHelper = new SchemaHelper(rootConnectionManager);
		rootSchemaHelper.execute("Create_Schema.sql");
		rootSchemaHelper.execute("Create_Tables.sql");
		connectionManager = new ConnectionManager("db-test.properties");
		schemaHelper = new SchemaHelper(connectionManager);
		schemaHelper.execute("Insert_Date.sql");
	}
	
	@Before
	public void init() throws SQLException, IOException {
		System.out.println("Init called");
	}
	
	@After
	public void cleanUp() {
		System.out.println("cleanUp called");
	}
	
	@AfterClass
	public static void shutdown() throws IOException, SQLException {
		schemaHelper.execute("Drop-Table.sql");
		rootSchemaHelper.execute("Drop_Schema.sql");
	}
	
	@Test
	public void getIphone() {
		ProductDAO dao = new ProductDAO(connectionManager);
		Product productById = dao.getProductById(1);
		System.out.println(productById);
		assertTrue(true);
	}
}
