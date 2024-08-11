package Assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Finddupes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1}; // Example array with duplicates

        Set<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicates: " + duplicates);
    }

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}

