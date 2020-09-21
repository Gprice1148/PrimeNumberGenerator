import static org.junit.Assert.assertEquals;

import PrimeNumber.PrimeNumberGeneratorImpl;
import Util.InputUtil;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Test class for testing PrimeNumberDriverTests
 *
 * @author Gordon Price
 */
public class PrimeNumberDriverTests {
    PrimeNumberGeneratorImpl primeNumberGenerator = new PrimeNumberGeneratorImpl();
    boolean validInputFlag = false;
    int lowerRangeInput = 0;
    int higherRangeInput = 0;

    @Test
    public void PrimeNumberDriver_ValidSimulatedUserInputValues_ReturnsTrue() {
        do {
            try {
                lowerRangeInput = 7900;
                higherRangeInput = 7920;
                validInputFlag = InputUtil.isValidInput(lowerRangeInput, higherRangeInput);
            } catch (Exception e) {
                System.out.println("Invalid input - Please enter in a whole number.");
            }
        } while (!validInputFlag);

        List<Integer> actualPrimeNumberList = primeNumberGenerator
            .generate(lowerRangeInput, higherRangeInput);

        List<Integer> expectedPrimeNumberList = Arrays.asList(7901, 7907, 7919);
        assertEquals(expectedPrimeNumberList, actualPrimeNumberList);
    }

}
