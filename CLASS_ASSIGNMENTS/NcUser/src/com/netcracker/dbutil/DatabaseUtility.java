package com.netcracker.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.netcracker.customexception.DatatabaseException;

public class DatabaseUtility {
		static Connection connection;
		
		public static Connection getDBConnection() throws DatatabaseException {
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "aryan", "ak");
				System.out.println("connection is established.");
			} 
			
			catch (ClassNotFoundException e) {
				throw new DatatabaseException(e.getMessage());
			} 
			
			catch (SQLException e) {
				throw new DatatabaseException(e.getMessage());
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
