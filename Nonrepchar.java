package Assignment;

import java.util.*;

public class Nonrepchar {

	public static int firstUniqChar(String s)
    {
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            boolean found = true;

           
            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i;
            }
        }

        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();  
		int pos= firstUniqChar(str);
		System.out.println("Index= " +pos + " Character= "+str.charAt(pos));
	}

}
