package Assignment;

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(CheckSubsequence("abc", "aebdc")); // true
        System.out.println(CheckSubsequence("abc", "acb")); // false
    }

    public static boolean CheckSubsequence(String s1, String s2) {
        int index = 0;
        for (char c : s2.toCharArray()) {
            if (index < s1.length() && s1.charAt(index) == c) {
                index++;
            }
        }
        return index == s1.length();
    }
}

