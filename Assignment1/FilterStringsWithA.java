package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsWithA {
	public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        List<String> filtered = strings.stream()
                                       .filter(s -> s.startsWith("A"))
                                       .collect(Collectors.toList());
        System.out.println("Strings starting with A: " + filtered);
    }
}
