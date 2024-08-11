package Assignment;

import java.util.*;
public class StringToInt {

	public static void convert(String s) 
	{ 
	      
	    int num = 0; 
	    int n = s.length(); 
	  
	    for(int i = 0; i < n; i++) 
	  
	        // Subtract 48 from the current digit 
	        num = num * 10 + ((int)s.charAt(i) - 48); 
	  
	    System.out.print(num); 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		convert(str);
	}

}
