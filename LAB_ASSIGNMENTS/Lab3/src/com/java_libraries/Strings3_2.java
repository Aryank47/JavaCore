package com.java_libraries;

public class Strings3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="";
		int flag=0;
		System.out.println("Enter a string: ");
		//str=new Scanner(System.in).nextLine();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)>str.charAt(j)) {
					flag=1;	
					break;
				}
			}
		}
		
		if (flag==1) {
			System.out.println("Negative String");
		}
		else {
			System.out.println("Positive string.");
		}
		
		
		

	}

}
