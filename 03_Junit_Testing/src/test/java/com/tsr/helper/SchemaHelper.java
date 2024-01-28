package com.tsr.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SchemaHelper {
	private ConnectionManager connectionManager;

	public SchemaHelper(ConnectionManager connectionManager) {
		super();
		this.connectionManager = connectionManager;
	}

	public void execute(String sqlFileLocation) throws IOException, SQLException {
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		StringBuffer buffer = null;
		String line = null;
		String sql = null;
		Statement statement = null;
		Connection connection = null;
		boolean flag = false;
		try {
			file = new File(this.getClass().getClassLoader().getResource(sqlFileLocation).getPath());
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
			sql = buffer.toString();

			connection = connectionManager.getConnection();
			statement = connection.createStatement();
			System.out.println("Now Executing : "+sql);
			statement.executeUpdate(sql);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (flag) {
				connection.commit();
				System.out.println("Comitted");
			} else {
				connection.rollback();
			}
			if (statement != null) {
				statement.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (fileReader != null) {
				fileReader.close();
			}
		}
	}

}
