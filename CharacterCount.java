package day10.lab6;

import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
		 String str = "Lorem Ipsum is simply dummy text";
		 char arr[] = str.toCharArray();
		 
		 CharacterCount obj = new CharacterCount();
		 Map<Character,Integer> map = obj.countChars(arr);
		 for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
		} 
	}
    
    public Map<Character,Integer> countChars(char[] chArray){
    	Map<Character,Integer> map = new HashMap<>();
    	for (char c : chArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
  
    	return map;
    }
}
