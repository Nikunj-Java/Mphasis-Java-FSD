package com.simplilearn.collections;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		//hashset class implemensts set interface
		//no guarantee that the constant order of element over time
		//methods add, remove,contains and size;
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		set.add(20);
		set.add(55);
		set.add(2);
		set.add(36);
		set.add(67);
		set.add(67);
		set.add(null);
		
		System.out.println("Size: "+set.size());
		
		System.out.println(set);
		
		System.out.println("Contains: "+ set.contains(55));
		
		set.remove(null);
		
		//iterate using for loop
		
		//iterate using iterator
	}

}
