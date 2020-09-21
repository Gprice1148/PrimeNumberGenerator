package Util;

/**
 * InputUtil handles additional logic related to the user's input
 *
 * @author Gordon Price
 */
public class InputUtil {

    public static boolean isValidInput(int lowerRangeInput, int higherRangeInput) {
        if (lowerRangeInput > 1 && higherRangeInput > lowerRangeInput) {
            return true;
        } else {
            System.out.println(
                "Invalid input - Please enter a whole number greater than 1 and a higher range that is greater than the lower range.");
            return false;
        }
    }

}
