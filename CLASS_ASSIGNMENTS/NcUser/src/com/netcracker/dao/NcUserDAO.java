package com.netcracker.dao;

import java.util.List;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dto.NcUser;

public interface NcUserDAO {
	
	public List<NcUser> getAllEmployee()throws DatatabaseException;
	
}
