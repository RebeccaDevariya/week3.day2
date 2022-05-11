package week3.day2;

import java.util.Arrays;
import java.util.List;

public class DuplicateValue {
	
	public static void main(String[] args) {
		
	int count=0;
	int flag=0;
		List<String> asList = Arrays.asList("A","B","C","D","E","A","G","F","C");
		int size=asList.size();
		for (int i = 0; i < size; i++) 
		{ 
			String str = asList.get(i); 
			if (str.contains("A"))
			{
				count++;
				
			}
			 if (str.contains("C"))
				{
				 flag++;
			
				}		 
			    
		}
		System.out.println("No.of time A is displayed : " +count);
    	System.out.println("No.of time C is displayed : " +flag);
	}

}
