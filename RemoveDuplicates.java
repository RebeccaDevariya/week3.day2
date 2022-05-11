package week3.day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
	
	String text ="We learn java basics as part of java sessions in java week1";
	int count =0;
	String[] str = text.split(" ");
	
	for(int i = 0; i<str.length; i++) 
	 {
		String a =str[i];
	 
		for(int j = i +1; j<str.length; j++) 
		 {
			String b =str[j];
			if(a.equals(b)) {
				count++;
				
				if (count > 0) {
					str[i]="";
					str[j]="";
							
				}
			 }
			}
		 }
		 System.out.println("The String without duplicates ");
		 for(String singleWord :str) {
			 System.out.print(singleWord); 
			 System.out.print(" "); 
			 
		 }
		 
	}
	
}
