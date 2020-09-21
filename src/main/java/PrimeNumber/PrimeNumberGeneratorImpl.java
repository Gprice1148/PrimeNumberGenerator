package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * PrimeNumberGeneratorImpl implements the PrimeNumberGenerator Interface and contains logic related
 * to finding prime numbers
 *
 * @author Gordon Price
 */

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {

    private final int LOWEST_POSSIBLE_PRIME = 2;

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = startingValue; i <= endingValue; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public boolean isPrime(int value) {
        for (int i = LOWEST_POSSIBLE_PRIME; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String primeNumberListToString(List<Integer> primeNumberList) {
        StringBuilder stringBuilder = new StringBuilder();

        if (primeNumberList.size() > 0) {
            for (int primeNumberInList : primeNumberList) {
                stringBuilder.append(primeNumberInList + "\n");
            }
        } else {
            stringBuilder.append("There are no prime numbers within that range.");
        }
        return stringBuilder.toString();
    }

}
