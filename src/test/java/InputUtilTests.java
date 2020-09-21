import static org.junit.Assert.assertEquals;

import Util.InputUtil;
import org.junit.Test;

/**
 * Test class for testing InputUtil
 *
 * @author Gordon Price
 */
public class InputUtilTests {

    @Test
    public void isValidInput_PassedValidNumbers_ReturnsTrue() {
        assertEquals(true, InputUtil.isValidInput(7900, 7920));
    }

    @Test
    public void isValidInput_PassedInvalidLowerRangeInput_ReturnsFalse() {
        assertEquals(false, InputUtil.isValidInput(1, 7920));
    }

    @Test
    public void isValidInput_PassedLowerRangeInputGreaterThanHigherRangeInput_ReturnsFalse() {
        assertEquals(false, InputUtil.isValidInput(55, 45));
    }

}
