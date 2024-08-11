package Assignment;

import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class First10Primes {
    public static void main(String[] args) {
        List<Integer> primes = IntStream.iterate(2, i -> i + 1)
                .filter(First10Primes::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("First 10 prime numbers: " + primes);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

