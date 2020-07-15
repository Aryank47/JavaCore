package com.netcracker;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city[]={"Pune","Mumbai","Tumkur","Bangalore","Patna",
				"Amritsar","Indore","Hyderabad","Chennai","Varanasi"};
		
        for(int i = 0; i < city.length-1; ++i) {
            for (int j = i + 1; j < city.length; ++j) {
                if (city[i].compareTo(city[j]) > 0) {
                    String temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order:");
        for(int i = 0; i < city.length; i++) {
            System.out.println(city[i]);
        }
	}
}

		


