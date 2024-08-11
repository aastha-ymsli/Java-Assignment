package Assignment;

import java.util.*;

public class CheckAnagram {

	 public static boolean areAnagrams(String s1, String s2)
	    {
	       
	        char[] charArray1 = s1.toCharArray();
	        char[] charArray2 = s2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        str1 = "gram";
        str2 = "arm";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
	}

}
