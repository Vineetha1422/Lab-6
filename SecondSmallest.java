package day10.lab6;

import java.util.*;

public class SecondSmallest {
    public static void main(String[] args) {
		SecondSmallest obj = new SecondSmallest();
		int[] arr = {45 , 90 , 23 , 7 , 56 , 24 , 78 , 67};
		System.out.println("The second Smallest value is : " + obj.getSecondSmallest(arr));
	}
    
    public int getSecondSmallest(int[] intArr) {
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i : intArr) {
    		list.add(i);
    	}
    	Collections.sort(list);
    	return list.get(1);
    }
}
