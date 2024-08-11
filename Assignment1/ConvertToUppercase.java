package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java");
        List<String> uppercased = strings.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println("Uppercased strings: " + uppercased);
    }
}

