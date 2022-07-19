package com.simplilearn.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		//tree set is one of the most imp implementation of sorted set interface in java
		// the order of the element is maintained by the set using their natural ordering
		// null is not allowed in treeset
		Set<String> set = new TreeSet<String>(); 
		
		set.add("Banana");
		set.add("Cherry");
		set.add("Almond");
		set.add("Apple");
		//set.add(null);
		
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Banana"));
		
		// iterate using for loop 
		
		// iterate using iterator
	 
		
	}

}
