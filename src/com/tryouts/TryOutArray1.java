package com.tryouts;
import java.util.ArrayList;
import java.util.List;

public class TryOutArray1 {
	
		public static  int MaxNum(List<Integer> numArray) {
			int max= Integer.MIN_VALUE;
			
			for (int i: numArray) {
				if(i>max) {
					max=i;
				}
			
			}
			return max;
			
		}
		public static void main(String[] args) {
			List<Integer> num=new ArrayList<>();
			num.add(5);
			num.add(8);
			num.add(12);
			int result = MaxNum(num);
			System.out.println("The max number="+result);
			

		}

	}

