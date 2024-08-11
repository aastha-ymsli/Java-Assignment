package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> distinct = numbers.stream()
                                       .collect(Collectors.toSet());
        System.out.println("Distinct elements: " + distinct);
    }
}

