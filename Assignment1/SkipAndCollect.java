package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                                      .skip(5)
                                      .limit(5)
                                      .collect(Collectors.toList());
        System.out.println("Skipped first 5, next 5 elements: " + result);
    }
}

