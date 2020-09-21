import static org.junit.Assert.assertEquals;

import PrimeNumber.PrimeNumberGeneratorImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Test class for testing PrimeNumberGeneratorImpl
 *
 * @author Gordon Price
 */
public class PrimeNumberGeneratorImplTests {

    PrimeNumberGeneratorImpl primeNumberGenerator = new PrimeNumberGeneratorImpl();

    @Test
    public void isPrime_PassedNonPrimeNumber_ReturnsFalse() {
        assertEquals(false, primeNumberGenerator.isPrime(4));
    }

    @Test
    public void isPrime_PassedPrimeNumber_ReturnsTrue() {
        assertEquals(true, primeNumberGenerator.isPrime(2));
    }

    @Test
    public void primeNumberListToString_PassedEmptyList_ReturnsErrorString() {
        List primeNumberList = new ArrayList();
        String expectedMessage = "There are no prime numbers within that range.";
        String actualMessage = primeNumberGenerator.primeNumberListToString(primeNumberList);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void primeNumberListToString_PassedListWithPrimeNumbers_ReturnsPrimeNumbersString() {
        List primeNumberList = Arrays.asList(7901, 7907, 7919);
        String expectedMessage = "7901\n7907\n7919\n";
        String actualMessage = primeNumberGenerator.primeNumberListToString(primeNumberList);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void generate_PassedValidRange_ReturnsCorrectPrimes() {
        List<Integer> actualPrimeNumberList = primeNumberGenerator.generate(7900, 7920);
        List<Integer> expectedPrimeNumberList = Arrays.asList(7901, 7907, 7919);
        assertEquals(expectedPrimeNumberList, actualPrimeNumberList);
    }


}
