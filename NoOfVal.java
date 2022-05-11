package week3.day2;


import java.util.ArrayList;

import java.util.List;


public class NoOfVal {
	public static void main(String[] args) {
		int count =0;
		List<Integer> list = new ArrayList<Integer>(); 
		
		list.add(1); 
		list.add(2);
		 list.add(3); 
		list.add(1);
		 list.add(4); 
		list.add(5);
		 list.add(1);
		 int size = list.size();
		 System.out.println(size); 
		 
		for (int i = 0; i < size; i++) 
		{ 
			Integer number = list.get(i); 
			if(number==1){
				count++;
			}
			 
		}
		 System.out.println("No.of time 1 is displayed : " +count); 
		
	
		
}
}
