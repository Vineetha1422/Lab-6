package day10.lab6;

import java.util.*;

import day10.task2.ProductLowToHigh;

public class SortedHaspMap {
    public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//inserting elements into HashMap
		map.put(1, "North");
		map.put(2, "South");
		map.put(3, "East");
		map.put(4, "West");
		
		/*map.put(5, "North"); same values are possible
		map.put(2, "West"); same keys are not possible
				
		map.remove(key); key based removal
		map.remove(3,"East"); key-value pair based removal
		
		Iterating through hashmap
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		} */
		
		//Sorted output
		SortedHaspMap obj = new SortedHaspMap();
		List<String> sortedList = obj.getValues(map);
		System.out.println("Sorted List of values from hashmap");
		for (String str : sortedList)
	      { 		      
	           System.out.println(str); 		
	      }
	}
    
    public List<String> getValues(HashMap<Integer,String> hm) {
    	List<String> list = new ArrayList<>(hm.values());
    	Collections.sort(list);
    	return list;
    }
}
