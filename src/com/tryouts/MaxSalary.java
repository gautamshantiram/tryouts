package com.tryouts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxSalary {
	public static  int maxSal(HashMap<String, Integer>Map) {
		
		int maxSal=(Collections.max(Map.values())); 
        for (Entry<String, Integer> entry : Map.entrySet()) { 
            if (entry.getValue()==maxSal);
			}
		return maxSal;
		}
public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Shanti", 40000);
		map.put( "Nisan",34000);
		map.put("Biplav",45000);
		map.put("Ganesh",32000);
		map.put("Abinash",56000);
		map.put("Mikesh",46000);
		map.put("Genete",55000);
		map.put("Indira",65000);
		map.put("Reema",76000);
		map.put("Ashif",45000);
		map.put("Rajan",44000);
		map.put("Ajay",50000);
		
	int result = maxSal(map);
	System.out.println("The max Salary is =" +"  "+ result);
		 }
}