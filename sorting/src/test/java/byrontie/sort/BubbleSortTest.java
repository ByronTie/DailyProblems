package byrontie.sort;

import org.junit.Test;
import java.util.List;
import byrontie.shared.RandomSampleGenerator;
import byrontie.TestBase;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest extends TestBase {

    @Test
    public void testBubbleSortNoEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(0, 100);
        assertTrue((new BubbleSort<Integer>()).sort(randomSample).isEmpty());
    }

    @Test
    public void testBubbleSortOneEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(1, 100);
        List<Integer> sortedSample = (new BubbleSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(sortedSample));
    }

    @Test
    public void testBubbleSortManyEntries() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(20, 100);
        List<Integer> sortedSample = (new BubbleSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(sortedSample));
    }

    
}
