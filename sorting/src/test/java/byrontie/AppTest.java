package byrontie;

import org.junit.Test;
import java.util.List;
import byrontie.RandomSampleGenerator;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testBubbleNoEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(0, 100);
        printArray(randomSample);
        (new BubbleSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(randomSample));
    }

    @Test
    public void testBubbleOneEntry() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(1, 100);
        printArray(randomSample);
        (new BubbleSort<Integer>()).sort(randomSample);
        assertTrue(isSorted(randomSample));
    }

    @Test
    public void testBubbleManyEntries() {
        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(20, 100);
        printArray(randomSample);
        (new BubbleSort<Integer>()).sort(randomSample);
        printArray(randomSample);
        assertTrue(isSorted(randomSample));
    }

    private <T> void printArray(List<T> list) {
        for(T i: list) {
            System.out.print(i.toString() + ", ");
        }
        System.out.println();
    }

    private boolean isSorted(List<Integer> sortedList) {
        if(sortedList.isEmpty() || sortedList.size() == 1) {
            return true;
        }

        for (int i = 1; i < sortedList.size(); i++) {
            if(sortedList.get(i) < sortedList.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    
}
