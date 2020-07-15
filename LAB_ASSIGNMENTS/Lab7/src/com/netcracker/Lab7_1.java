package com.netcracker;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] product=new String[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<product.length;i++) {
			System.out.println("Enter the product:");
			product[i]=sc.nextLine();
		}
		Arrays.sort(product);
		System.out.println();
		System.out.println("The product list:");
		for(int i=0;i<product.length;i++) {
			
			System.out.println(product[i]);
		}

	}

}
