package com.tryouts;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CollectionDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		map.put(40, "Shanti");
		map.put( 23, "Nisan");
		map.put(32, "Biplav");
		map.put(22, "Ganesh");
		map.put(33, "Abinash");
		map.put(30, "Mikesh");
		map.put(20, "Genete");
		map.put(35, "Indira");
		map.put(26, "Reema");
		map.put(27, "Ashif");
		map.put(32, "Rajan");
		map.put(55, "Ajay");
		
		int maxAge=(Collections.max(map.keySet())); 
        for (Entry<Integer, String> entry : map.entrySet()) { 
            if (entry.getKey()==maxAge) {
                System.out.println(entry.getKey()+"  "+entry.getValue()); 
               

            }}}}
//        Collections.sort((List<Integer>) map);       
//        Collections.sort((List<Integer>) map);
//		
//		for (Map.Entry<Integer,String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue()+ ",  ");
//		}
//		System.out.println("===================================================================================================");
//		System.out.println("Key without Value    -->  "+map.keySet());
//		System.out.println("Value without Key    -->  "+map.values());
//
//		System.out.println("===================================================================================================");
//
//		System.out.println("Value with Key  -->  "+map);

	


