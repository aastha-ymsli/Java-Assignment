package Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSortAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("Bhavesh", "Aastha", "Urmila", "Mukesh", "Rati");
        List<String> sortedStrings = strings.stream()
                                             .sorted() 
                                             .collect(Collectors.toList()); 
        System.out.println("Sorted list of strings:");
        sortedStrings.forEach(System.out::println); 
    
	}

}
