package Assignment;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        rotateArrayByOne(array);

        System.out.println("Array after rotation: " + Arrays.toString(array));
    }

    public static void rotateArrayByOne(int[] array) {
        if (array.length == 0) return;

        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }
}

