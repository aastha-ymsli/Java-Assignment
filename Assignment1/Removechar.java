package Assignment;

import java.util.*;

public class Removechar {

	 public static String charRemoveAt(String str, int p) {  
         return str.substring(0, p) + str.substring(p + 1);  
      }  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		System.out.print("Enter index: "); 
		int var = sc.nextInt();
		System.out.println(charRemoveAt(str, var));
	}

}
