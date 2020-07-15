package com.netcracker.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netcracker.customexception.CustomException;
import com.netcracker.dao.MobileDao;
import com.netcracker.dao.MobileDaoImpl;
import com.netcracker.dto.Customer;
import com.netcracker.dto.Mobile;

public class MobileServiceImpl implements MobileService {
	MobileDao mobDao=new MobileDaoImpl();
	@Override
	public int insertPurchaseDetails(Customer customer) throws CustomException {
		// TODO Auto-generated method stub
		return mobDao.insertPurchaseDetails(customer);
	}

	@Override
	public int updateMobileQuantity(int quantity, Customer customer) throws CustomException {
		// TODO Auto-generated method stub
		return mobDao.updateMobileQuantity(quantity, customer);
	}

	@Override
	public List<Mobile> viewAll() throws CustomException {
		// TODO Auto-generated method stub
		return mobDao.viewAll();
	}

	@Override
	public int deleteMobile(int mobileId) throws CustomException {
		// TODO Auto-generated method stub
		return mobDao.deleteMobile(mobileId);
	}

	@Override
	public List<Mobile> searchOnPriceRange(double lowerPriceRange, double upperPriceRange) throws CustomException {
		// TODO Auto-generated method stub
		return mobDao.searchOnPriceRange(lowerPriceRange, upperPriceRange);
	}

	@Override
	public boolean verifyCustomer(Customer customer) throws CustomException {
		
		
		Pattern name=Pattern.compile("^[A-Za-z0-9]+(?:[ _-][A-Za-z0-9]+)*$");
		Matcher n = name.matcher(customer.getName());
		boolean nameMatch = n.matches();
		
		Pattern email=Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
		Matcher e = email.matcher(customer.getEmail());
		boolean emailMatch = e.matches();
		
		
		  Pattern mobile=Pattern.compile("^[0-9]{10}$"); 
		  Matcher m =mobile.matcher(customer.getContact()); 
		  boolean mobileMatch =m.matches();
		  
		  Pattern mobileid=Pattern.compile("^[0-9]{1,4}$");
		  String str=String.valueOf(customer.getMobileId());
		  Matcher mi =mobileid.matcher(str); 
		  boolean mobileidMatch =mi.matches();
		  
		 
		  if(nameMatch==false) {
			  throw new CustomException("Wrong Name.");
		  }
		  if(mobileMatch==false) {
			  throw new CustomException("Wrong mobile number.");
		  }
		  if(emailMatch==false) {
			  throw new CustomException("Wrong email.");
		  }
		  if(mobileidMatch==false) {
			  throw new CustomException("Wrong mobile id.");
		  }
		  else {
			  return true;
		  }
		 
		
			
		 
		
		
		
	}

}
