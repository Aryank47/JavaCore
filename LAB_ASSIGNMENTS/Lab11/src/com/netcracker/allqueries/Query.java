package com.netcracker.allqueries;

public interface Query {
	//String SEQUENCE="create sequence sq start with 00000 increment by 2 maxvalue 99999";
	String INSERT="insert into purchasedetails values (sq.nextval,?,?,?,?,?)";
	String UPDATE="update mobiles set quantity=quantity-? where mobileid=?";
	String GETALL="select * from mobiles";
	String DELETE="delete from mobiles where mobileid=?";
	String SEARCH="select * from mobiles where price>? and price<?";

}
