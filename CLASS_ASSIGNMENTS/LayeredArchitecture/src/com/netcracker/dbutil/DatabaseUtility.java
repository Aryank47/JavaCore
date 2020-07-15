package com.netcracker.dbutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.netcracker.customexception.DatatabaseException;

public class DatabaseUtility {
		static Connection connection;
		
		public static Connection getDBConnection() throws DatatabaseException {
			
			FileInputStream fis;
			try {
				fis = new FileInputStream("jdbc.properties");
				Properties pros=new Properties();
				pros.load(fis);
				Class.forName(pros.getProperty("driver"));
				System.out.println("Driver loaded");
				connection=DriverManager.getConnection(pros.getProperty("url"),pros.getProperty("username"),pros.getProperty("password"));
				System.out.println("connection is established.");
			} 
			
			catch (ClassNotFoundException e) {
				throw new DatatabaseException(e.getMessage());
			} 
			
			catch (SQLException e) {
				throw new DatatabaseException(e.getMessage());
			}
			catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return connection;
			
		}
		
		public static void releaseConnection() throws DatatabaseException {
			
			try {
				connection.close();
			}
			
			catch(SQLException e) {
				throw new DatatabaseException(e.getMessage());
				
			}
		}

}
