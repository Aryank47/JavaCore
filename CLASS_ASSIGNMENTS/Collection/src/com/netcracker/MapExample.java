package com.netcracker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	Map<Long, String> contact;
	public void createHashMap() {
		contact=new HashMap<Long,String>();
		contact.put(7619468380L, "Aryan");
		contact.put(9011362610L, "Pramod");
		contact.put(9011362910L, "Pramou");
		contact.put(9011362600L, "Pramok");
		contact.put(9011362450L, "Pramol");
		System.out.println("Size is "+contact.size());
		System.out.println(contact);
		
		System.out.println(contact.get(7619468380L));
		Set<Long> allKeys=contact.keySet();
		System.out.println(allKeys);
		Iterator<Long> it=allKeys.iterator();
		while(it.hasNext()) {
			Long its=it.next();
			
			System.out.println(its+" " +contact.get(its));
		}
	}

}
