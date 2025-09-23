package tests.Easy;

import Easy.MostFrequentEven;
import org.junit.Test;
import static org.junit.Assert.*;

public class MostFrequentEvenTest {

    @Test
    public void testExample1() {
        MostFrequentEven solution = new MostFrequentEven();
        int[] nums = {0,1,2,2,4,4,1};
        assertEquals(2, solution.mostFrequentEven(nums));
    }

    @Test
    public void testExample2() {
        MostFrequentEven solution = new MostFrequentEven();
        int[] nums = {4,4,4,9,2,4};
        assertEquals(4, solution.mostFrequentEven(nums));
    }

    @Test
    public void testExample3() {
        MostFrequentEven solution = new MostFrequentEven();
        int[] nums = {29,47,21,41,13,37,25,7};
        assertEquals(-1, solution.mostFrequentEven(nums));
    }
}
