package com.netcracker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Lab7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> product=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int option=1;
		while(option<=10) {
			System.out.println("Enter the product:");
			product.add(sc.nextLine());
			option++;
		}
		System.out.println();
		System.out.println("Product list:");
		System.out.println(product);
		System.out.println();
		System.out.println("sorted product list:");
		product.sort(Comparator.naturalOrder());
		System.out.println(product);
		
	}

}
