package day10.lab6;

import java.util.*;

public class SquareOfNumbers {
    public static void main(String[] args) {
	int[] arr = {2 , 6 , 12 , 67 , 3 , 10};	
	
	SquareOfNumbers obj = new SquareOfNumbers();
	Map<Integer,Integer> map = obj.getSquares(arr);
    
    for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
    } 
    }  
    public Map<Integer,Integer> getSquares(int[] intArr){
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int num : intArr) {
    		map.put(num, num*num);
    	}
    	return map;
    }
}
