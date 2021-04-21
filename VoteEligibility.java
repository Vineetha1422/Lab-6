package day10.lab6;

import java.util.*;
import java.time.*;

public class VoteEligibility {
    public static void main(String[] args) {
	Map<String,LocalDate> map = new HashMap<>();
	map.put("UD123", LocalDate.of(2012,4,24));
	map.put("UD124", LocalDate.of(2000,7,2));
	map.put("UD145", LocalDate.of(1994,5,13));
	map.put("UD278", LocalDate.of(1980,11,20));
	map.put("UD156", LocalDate.of(2007,9,7));
	map.put("UD753", LocalDate.of(2002,3,23));
	map.put("UD835", LocalDate.of(1996,1,31));
	
	VoteEligibility obj = new VoteEligibility();
	List<String> eligibleList = obj.votersList(map);
	
	for (String str : eligibleList)
    { 		      
         System.out.println(str); 		
    }
	}
    
    public List<String> votersList(Map<String,LocalDate> map){
    List<String> list = new ArrayList<>();
    LocalDate today = LocalDate.now();
    for(Map.Entry m : map.entrySet()){    
	    LocalDate bod = (LocalDate) m.getValue();
	    Period period = bod.until(today);
	    if(period.getYears() > 18) {
	    	list.add(m.getKey().toString());
	    }
    } 
    return list;
    }
}
