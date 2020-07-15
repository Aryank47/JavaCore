package com.netcracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public void createArrayList() {
		List<String> myList=new ArrayList<String>();
		myList.add("12");
		myList.add("34.5f");
		myList.add("A");
		myList.add("Aryan");
		myList.add("12");
		int size=myList.size();
		System.out.println("Size is "+size);
		System.out.println(myList);
		Object o=myList.get(3);
		System.out.println(o);
		myList.add(3,"AAryan");
		if(myList.contains(34.5f)) {
			myList.remove(34.5f);
		}
		else {
			System.out.println("obj dosent exists");
		}
		
		System.out.println("After removing "+myList+" Size is "+myList.size());
		Iterator it=myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}



public void createLinkedList() {
	
	List<Integer> myLL=new LinkedList<Integer>();
	
	myLL.add(100);
	myLL.add(200);
	((LinkedList<Integer>)myLL).add(300);
	
	System.out.println(myLL);
	
}
}