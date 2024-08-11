package Assignment;

import java.util.Scanner;

public class CheckrotationString {
	    public static boolean isFlipedString(String s1, String s2) {
	        return s1.length() == s2.length() && (s1 + s1).contains(s2);
	    }
	    
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			System.out.print("Enter a string1: ");  
			String str1= sc.nextLine();  
			System.out.print("Enter a string2: ");  
			String str2= sc.nextLine(); 
			System.out.println(isFlipedString(str1,str2));
  }
}
