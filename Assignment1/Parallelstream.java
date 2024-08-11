package Assignment;

import java.util.*;

public class Parallelstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        double average = numbers.parallelStream()
	                                .mapToInt(Integer::intValue)
	                                .average()
	                                .orElse(0);
	        System.out.println("Average: " + average);

	}

}
