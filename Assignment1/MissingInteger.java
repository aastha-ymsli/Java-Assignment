package Assignment;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5}; // Example where 4 is missing
        System.out.println("Missing integer: " + findMissingInteger(array));
    }

    public static int findMissingInteger(int[] array) {
        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = Arrays.stream(array).sum();
        return sum - arraySum;
    }
}
