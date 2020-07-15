package com.netcracker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.netcracker.allquery.Query;
import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dbutil.DatabaseUtility;
import com.netcracker.dto.NcUser;

public class NcUserDAOImpl implements NcUserDAO {

	public List<NcUser> getAllEmployee() throws DatatabaseException {
		// TODO Auto-generated method stub
		Connection connection=DatabaseUtility.getDBConnection();
		List<NcUser> list=new LinkedList<NcUser>();
		NcUser ncuser=null;
		try {
			PreparedStatement statement=connection.prepareStatement(Query.GETALL);
			ResultSet res=statement.executeQuery();
			while(res.next()) {
				ncuser=new NcUser(res.getString(1),res.getString(2));
				list.add(ncuser);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DatatabaseException(e.getMessage());
		}
		DatabaseUtility.releaseConnection();
		return list;
	}

}
