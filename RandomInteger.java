package Assignment;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomInteger {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream randomInts = random.ints(10);

        randomInts.forEach(System.out::println);
    }
}

