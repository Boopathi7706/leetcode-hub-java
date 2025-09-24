package tests.Medium;

import Medium.KthLargestElement;
import org.junit.Test;
import static org.junit.Assert.*;

public class KthLargestElementTest {

    @Test
    public void testExample1() {
        KthLargestElement solution = new KthLargestElement();
        assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }

    @Test
    public void testExample2() {
        KthLargestElement solution = new KthLargestElement();
        assertEquals(4, solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    @Test
    public void testSingleElement() {
        KthLargestElement solution = new KthLargestElement();
        assertEquals(10, solution.findKthLargest(new int[]{10}, 1));
    }
}
