package com.java_libraries;

public class Strings3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch(Integer.parseInt(args[1])){
			
			case 1:
				String res=args[0]+args[0];
				System.out.println("String concatenated with itself = "+res);
				break;
				
			case 2:
				String str1=args[0];
				for(int i=0;i<=str1.length();i++) {
					if((i % 2) != 0) {
						 str1=str1.substring(0, i) + "#" + str1.substring(i+1 , str1.length());
					}
				}
				System.out.println("Replaced string is: "+str1);
				break;
				
			case 3:
				/*String stringWithDuplicates=args[0];
				char[] characters = stringWithDuplicates.toCharArray();
				boolean[] found = new boolean[256];
				StringBuilder sb = new StringBuilder();
				System.out.println("String with duplicates : " + stringWithDuplicates);
				for (char c : characters) {
					if (!found[c]) {
					    found[c] = true;
					    sb.append(c);
					}
				}
				System.out.println("String after duplicates removed : " + sb.toString());*/
				
				
				StringBuilder sb=new StringBuilder(args[0]);
				StringBuilder sb1 = new StringBuilder();
				for(int i=0;i<sb.length();i++) {
					int flag=0;
					for(int j=i+1;j<sb.length();j++) {
						if(sb.charAt(i)==sb.charAt(j)) {
							flag=1;	
						}
					}
					if(flag==0) {
						sb1.append(sb.charAt(i));
					}
				}
				System.out.println("String with duplicates : " + sb);
				System.out.println("String after duplicates removed : " + sb1.toString());
				break;
				
			case 4:
			
			 String	str2=args[0];
				//StringBuffer str2;
				for(int i=0;i<=str2.length();i++) {
					if((i % 2) != 0) {
						 str2=str2.substring(0, i) + Character.toUpperCase(str2.charAt(i)) 
						 + str2.substring(i+1,str2.length());
					}
					}
				System.out.println("Replaced string is: "+ str2);
				}
				
				
				
		}

	}


