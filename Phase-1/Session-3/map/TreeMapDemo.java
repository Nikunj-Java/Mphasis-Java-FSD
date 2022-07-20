package com.simplilearn.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		
		//null key is not accepted in tree map but null value can be accepted
		// treemap is implementation of map and sorted map
		//it maintains insertion order
		
		
		
		
		map.put(1, "Nikunj");
		map.put(2, "Dilip");
		
		map.put(3, "ALex");
		
		map.put(4, null); //key is not null but value is null
		//map.put(null, "Soni"); //key is null but value is not null and not be added in map
		
		//you can add only one null key in map
		//map.put(null, null);//both key and value are null
		
		map.put(5, "Nikunj");
		
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		
		System.out.println("Get element at key 5: "+map.get(5));
		
		System.out.println("Get element at key 4: "+map.get(4));
		
		//System.out.println("Get element at key null: "+map.get(null));//as key is null value soni is not added in map
		
		System.out.println("Get element at key 6: "+map.get(6));//as element is not present it will give you null answer
		
		//remove element by key
		
		map.remove(5);
		
		System.out.println(map);
		
		///iterate using for loop
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" , "+m.getValue());
		}
		
		
	}

}
