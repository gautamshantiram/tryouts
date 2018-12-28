package com.tryouts;

import java.util.ArrayList;
import java.util.List;

public class TryOutArray {
	public static  int sum(List<Integer> numArray) {
		int sum=0;
		for (int i: numArray) {
			sum += i;
		
		}
		return sum;
		
	}
	public static void main(String[] args) {
	
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		int result = sum(num);
		System.out.println("The sum of the given numbers ="+result);
		

	}

}
