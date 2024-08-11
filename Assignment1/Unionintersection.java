package Assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unionintersection {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {3, 6, 7, 10};

        System.out.println("Union: " + Arrays.toString(findUnion(array1, array2)));
        System.out.println("Intersection: " + Arrays.toString(findIntersection(array1, array2)));
    }

    public static int[] findUnion(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) set.add(num);
        for (int num : array2) set.add(num);

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : array1) set1.add(num);
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}

