package tests.Easy;

import Easy.IntersectionOfTwoArraysII;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class IntersectionOfTwoArraysIITest {

    @Test
    public void testCase1() {
        IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        int[] result = solution.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        assertArrayEquals(new int[]{2,2}, result);
    }

    @Test
    public void testCase2() {
        IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        int[] result = solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{4,9}, result);
    }
}
