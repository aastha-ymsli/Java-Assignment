package Assignment;

import java.util.*;

public class Rverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                    
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0;--i)                
		{  
		System.out.print(s.charAt(i-1));
	}

}
}
