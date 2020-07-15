package com.netcracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	Set<Integer> mySet;
	public void createHashSet() {
		mySet=new HashSet<Integer>();
		mySet.add(23);
		mySet.add(123);
		mySet.add(567);
		mySet.add(879);
		mySet.add(7);
		System.out.println("Size is "+mySet.size());
		System.out.println(mySet);
	}
	
	public void createLinkedHashSet() {
		mySet=new LinkedHashSet<Integer>();
		mySet.add(23);
		mySet.add(123);
		mySet.add(567);
		mySet.add(879);
		mySet.add(7);
		System.out.println("Size is "+mySet.size());
		System.out.println(mySet);
	}
	
	public void createTreeSet() {
		mySet=new TreeSet<Integer>();
		mySet.add(23);
		mySet.add(123);
		mySet.add(567);
		mySet.add(879);
		mySet.add(7);
		System.out.println("Size is "+mySet.size());
		System.out.println(mySet);
		
		mySet= new TreeSet<Integer>( Comparator.reverseOrder() ) ;
		mySet.add(23);
		mySet.add(123);
		mySet.add(567);
		mySet.add(879);
		mySet.add(7);
		System.out.println("Size is "+mySet.size());
		System.out.println(mySet);
	}

}
