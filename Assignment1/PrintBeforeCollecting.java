package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintBeforeCollecting {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<String> result = strings.stream()
                                     .peek(System.out::println)
                                     .collect(Collectors.toList()); 
        System.out.println("Collected list: " + result);
    }
}
