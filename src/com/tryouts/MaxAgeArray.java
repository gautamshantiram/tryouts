package com.tryouts;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxAgeArray {
	public static  int maxAge(HashMap<Integer, String>Map) {
		
		int maxAge=(Collections.max(Map.keySet())); 
        for (Entry<Integer, String> entry : Map.entrySet()) { 
            if (entry.getKey()==maxAge);
			}
		return maxAge;
		}
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(40, "Shanti");
		map.put( 23, "Nisan");
		map.put(32, "Biplav");
		map.put(22, "Ganesh");
		map.put(33, "Abinash");
		map.put(30, "Mikesh");
		map.put(20, "Genete");
		map.put(35, "Indira");
		map.put(26, "Reema");
		map.put(47, "Ashif");
		map.put(32, "Rajan");
		map.put(25, "Ajay");
		
	int result = maxAge(map);
	System.out.println("The max Age is =" +"  "+ result);
		 }
}