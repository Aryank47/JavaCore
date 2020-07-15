package com.netcracker.service;

import java.util.List;

import com.netcracker.customexception.DatatabaseException;
import com.netcracker.dto.NcUser;

public interface NcUserService {
	public List<NcUser> getAllEmployee()throws DatatabaseException;
	
	public String Authenticate(NcUser ncuser)throws DatatabaseException;
}
