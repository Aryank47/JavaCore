package com.netcracker;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1=new String("Aryan");
		//String s2=new String("Aryan");
		String s3="aryan";
		String s4="ARYAN";
		if(s3==s4){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
		
		System.out.println("String length "+s3.length());
		System.out.println("character at index 4 is "+s3.charAt(3));
		System.out.println("Index of y is "+s3.indexOf('y'));
		System.out.println("Is string s3=s4 = "+s3.equals(s4));
		s4=s4.toLowerCase();
		System.out.println("Is string s3=s4 = "+s3.equals(s4));
		System.out.println("Sub string of \"aryan\" is "+s3.substring(1));
		System.out.println(s3.compareTo(s4));
		System.gc();//garbage collector request
		
	}

}
