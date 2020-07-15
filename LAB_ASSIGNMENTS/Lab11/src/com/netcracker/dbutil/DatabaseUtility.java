package com.netcracker.dbutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.netcracker.customexception.CustomException;

public class DatabaseUtility {
	static Connection connection;
	public static Connection getConnection() throws CustomException {
		FileInputStream fis;
		try {
			fis = new FileInputStream("jdbc.properties");
			Properties prop=new Properties();
			prop.load(fis);
			prop.getProperty("driver");
			System.out.println("Driver Loaded.");
			connection=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
			System.out.println("connection is established.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new CustomException(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new CustomException(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CustomException(e.getMessage());
		}
		return connection;
		
	}
	
	public static void releaseConnection() throws CustomException {
		
		try {
			connection.close();
		}
		
		catch(SQLException e) {
			throw new CustomException(e.getMessage());
			
		}
	}

	

}
