package Assignment;

import java.util.Scanner;

public class PalCheck {
	public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(input + " is a palindrome: " + isPalindrome(input));
    }
}
