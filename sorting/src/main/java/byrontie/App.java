package byrontie;

import byrontie.shared.RandomSampleGenerator;
import byrontie.sort.MergeSort;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> randomSample = RandomSampleGenerator.getRandomNumberAsList(21, 100);
        printArray(randomSample);
        printArray((new MergeSort<Integer>()).sort(randomSample));
    }
    
    private static <T> void printArray(List<T> list) {
        for(T i: list) {
            System.out.print(i.toString() + ", ");
        }
        System.out.println();
    }
}
