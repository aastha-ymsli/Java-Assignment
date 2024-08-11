package Assignment;

import java.util.Arrays;

public class MaxVal {
	public static void main(String[] args) 
    { 
	 int arr[] = {10, 324, 45, 90, 1000}; 
		int max = Arrays.stream(arr).max().getAsInt(); 
	   
      System.out.println("Largest in given array is " +max); 
    } 
}
