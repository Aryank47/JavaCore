package com.netcracker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Lab8_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\Aryan Kumar\\Desktop\\NetcrackerJavaTaning\\number.txt");
		Scanner sc=new Scanner(fr);
		sc.useDelimiter(",");
		while(sc.hasNext()) {	
			if(!sc.hasNext(",")) {
				System.out.print(sc.next()+"\t");
			}
			
		}

	}

}
