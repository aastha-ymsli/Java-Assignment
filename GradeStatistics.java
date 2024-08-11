package Assignment;

import java.util.Arrays;

public class GradeStatistics {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        double average = Arrays.stream(grades).average().orElse(0);
        int highest = Arrays.stream(grades).max().orElse(0);
        int lowest = Arrays.stream(grades).min().orElse(0);

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}

