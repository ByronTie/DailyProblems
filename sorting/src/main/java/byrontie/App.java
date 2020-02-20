package byrontie;

import byrontie.RandomSampleGenerator;
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
        (new MergeSort<Integer>()).sort(randomSample);
        printArray(randomSample);
    }

    private static <T> void printArray(List<T> list) {
        for(T i: list) {
            System.out.print(i.toString() + ", ");
        }
        System.out.println();
    }
}