package Assignment;

import java.util.*;

public class CharFreq {

	  static final int SIZE = 26;
	  
	    static void printCharFreq(String s)
	    {
	        Map<Character, Integer> d
	            = new HashMap<Character, Integer>();
	 
	        for (int i = 0; i < s.length(); i++) {
	            if (d.containsKey(s.charAt(i))) {
	                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
	            }
	            else {
	                d.put(s.charAt(i), 1);
	            }
	        }
	        for (int i = 0; i < s.length(); i++) {
	 
	            if (d.get(s.charAt(i)) != 0) {
	                System.out.print(s.charAt(i));
	                System.out.print(d.get(s.charAt(i)));
	                d.put(s.charAt(i), 0);
	                System.out.println();
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Different";
        printCharFreq(str);
	}

}
