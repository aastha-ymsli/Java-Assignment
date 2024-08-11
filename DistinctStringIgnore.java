package Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctStringIgnore {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "apple", "Banana", "banana");
        Set<String> distinct = strings.stream()
                                      .map(String::toLowerCase)
                                      .collect(Collectors.toSet());
        System.out.println("Distinct strings ignoring case: " + distinct);
    }
}
