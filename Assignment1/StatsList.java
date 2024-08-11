package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StatsList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();

        System.out.println("Average: " + average.orElse(Double.NaN));
        System.out.println("Maximum: " + max.orElse(Integer.MIN_VALUE));
        System.out.println("Minimum: " + min.orElse(Integer.MAX_VALUE));
    }
}
