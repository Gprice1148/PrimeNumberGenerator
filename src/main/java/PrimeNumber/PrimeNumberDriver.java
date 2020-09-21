package PrimeNumber;

import Util.InputUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * PrimeNumberDriver exists to drive the main program and create a testable environment
 *
 * @author Gordon Price
 */
public class PrimeNumberDriver {
    public static String PrimeNumberDriver() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrimeNumberGeneratorImpl primeNumberGenerator = new PrimeNumberGeneratorImpl();
        boolean validInputFlag = false;
        int lowerRangeInput = 0;
        int higherRangeInput = 0;

        do {
            try {
                System.out.print("Please enter in the lower inclusive number of your range: ");
                lowerRangeInput = Integer.parseInt(br.readLine());

                System.out.print("Please enter in the higher inclusive number of your range: ");
                higherRangeInput = Integer.parseInt(br.readLine());

                validInputFlag = InputUtil.isValidInput(lowerRangeInput, higherRangeInput);
            } catch (Exception e) {
                System.out.println("Invalid input - Please enter in a whole number.");
            }
        } while (!validInputFlag);

        List<Integer> primeNumberList = primeNumberGenerator
            .generate(lowerRangeInput, higherRangeInput);
        return primeNumberGenerator.primeNumberListToString(primeNumberList);
    }
}
