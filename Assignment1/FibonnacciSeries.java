package Assignment;

import java.util.Scanner;

public class FibonnacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        printFibonacci(terms);
    }

    public static void printFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

