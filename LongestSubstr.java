package Assignment;

import java.util.HashMap;

public class LongestSubstr {

	    static int longestUniqueSubsttr(String str) {
	        int n = str.length();
	        int res = 0; // result
	        int i = 0;
	        HashMap<Character, Integer> lastIndex = new HashMap<>();
	        for (int j = 0; j < n; j++) {
	            if (lastIndex.containsKey(str.charAt(j))) {
	                i = Math.max(i, lastIndex.get(str.charAt(j)) + 1);
	            }
	            res = Math.max(res, j - i + 1);
	            lastIndex.put(str.charAt(j), j);
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        String str1 = "ABCDEFGABEF";
	        System.out.println("Length of the longest substring without repeating characters: " + longestUniqueSubsttr(str1));

	        String str2 = "geeks";
	        System.out.println("Length of the longest substring without repeating characters: " + longestUniqueSubsttr(str2));
	    }
}
