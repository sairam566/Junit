package com.tsr.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionManager {

	private String driverClassName;
	private String URL;
	private String userName;
	private String password;
	private Properties properties = null;
	private BasicDataSource dataSource = null;

	public ConnectionManager(String dbFileName) throws SQLException {
		super();
		try {
			properties = new Properties();
			properties.load(this.getClass().getClassLoader().getResourceAsStream(dbFileName));
			this.driverClassName = properties.getProperty("db.className");
			this.URL = properties.getProperty("db.url");
			this.userName = properties.getProperty("db.userName");
			this.password = properties.getProperty("db.password");
			Class.forName(driverClassName);
			dataSource = new BasicDataSource();
			dataSource.setUrl(URL);
			dataSource.setUsername(userName);
			dataSource.setPassword(password);
			dataSource.setMinIdle(5);
			dataSource.setMaxIdle(10);
			dataSource.setMaxOpenPreparedStatements(100);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
