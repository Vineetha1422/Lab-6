package day10.lab6;

import java.util.*;

public class StudentMedals {
    public static void main(String[] args) {
	StudentMedals obj = new StudentMedals();
	HashMap<Integer,Integer> map = new HashMap<>();
	map.put(101, 34);
	map.put(102, 76);
	map.put(103, 93);
	map.put(104, 78);
	map.put(105, 80);
	map.put(106, 44);
	map.put(107, 12);
	
	HashMap<Integer,String> medals = obj.getStudents(map);
	for(Map.Entry m : medals.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
    } 
	}
    
    public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
    	HashMap<Integer,String> map = new HashMap<>();
    	for(Map.Entry m : hm.entrySet()){    
    	    if((int)m.getValue() >= 90) map.put((int)m.getKey(), "Gold");    
    	    else if((int)m.getValue() >= 80 && (int)m.getValue() < 90) map.put((int)m.getKey(), "Silver");
    	    else if((int)m.getValue() >= 70 && (int)m.getValue() < 80) map.put((int)m.getKey(), "Bronze");
    	    else continue;
    	    
    	    
        } 
    	return map;
    }
}
