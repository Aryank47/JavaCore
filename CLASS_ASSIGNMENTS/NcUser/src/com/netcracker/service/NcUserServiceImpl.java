package com.netcracker.service;

import java.util.List;


import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dao.NcUserDAO;
import com.netcracker.dao.NcUserDAOImpl;
import com.netcracker.dto.NcUser;

public class NcUserServiceImpl implements NcUserService {

	NcUserDAO ncUser=new NcUserDAOImpl();

	public String Authenticate(NcUser ncuser) throws DatatabaseException {
		// TODO Auto-generated method stub
		int flag=0;
		
		for(NcUser e : ncUser.getAllEmployee()) {
			//System.out.println(e.getUserName()+" "+e.getPassword());
			if(e.getPassword().equals(ncuser.getPassword()) & e.getUserName().equals(ncuser.getUserName())) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			return "User Authenticated";
		}
		else {
			return "Please check your Username and Password.";
		}
		
	}


	public List<NcUser> getAllEmployee() throws DatatabaseException {
		// TODO Auto-generated method stub
		
		
		return ncUser.getAllEmployee();
	}

}
