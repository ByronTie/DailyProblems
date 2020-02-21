package byrontie.sort;

import org.junit.Test;
import java.util.List;
import byrontie.shared.RandomSampleGenerator;
import byrontie.TestBase;

import static org.junit.Assert.*;

public class MergeSortTest extends TestBase {

    @Test
    public void testMergeSortNoEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(0, 100);
        assertTrue((new MergeSort<Integer>()).sort(randomSample).isEmpty());
    }

    @Test
    public void testMergeSortOneEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(1, 100);
        List<Integer> sortedSample = (new MergeSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(sortedSample));
    }

    @Test
    public void testMergeSortManyEntries() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(20, 100);
        List<Integer> sortedSample = (new MergeSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(sortedSample));
    }
}