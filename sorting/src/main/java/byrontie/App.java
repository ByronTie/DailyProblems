package byrontie;

import byrontie.BubbleSort;
import byrontie.RandomSampleGenerator;

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
        
        int[] randomSample = RandomSampleGenerator.getRandomNumberSample(20, 100);
        printArray(randomSample);
        printArray((new BubbleSort(randomSample)).sort());
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    
}
