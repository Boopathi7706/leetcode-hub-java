package tests.Medium;

import Medium.ReverseInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger solution = new ReverseInteger();

        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(1534236469));  // overflow
        assertEquals(0, solution.reverse(-1534236469)); // negative overflow
    }
}
