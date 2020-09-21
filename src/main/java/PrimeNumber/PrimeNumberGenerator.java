package PrimeNumber;

import java.util.List;

/**
 * PrimeNumberGenerator is an interface defining the methods needed to find prime numbers
 *
 * @author Gordon Price
 */
interface PrimeNumberGenerator {
    List<Integer> generate(int startingValue, int endingValue);

    boolean isPrime(int value);

    String primeNumberListToString(List<Integer> primeNumberList);
}
