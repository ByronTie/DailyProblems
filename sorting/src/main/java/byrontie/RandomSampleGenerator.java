package byrontie;

import java.util.List;
import java.util.ArrayList;

public class RandomSampleGenerator {
    public static int[] getRandomNumberAsArray(int sampleSize, int variance) {
        int[] randomNumberSample = new int[sampleSize];

        for (int i = 0; i < sampleSize; i++) {
            randomNumberSample[i] = (int)(Math.random() * variance + 1);
        }

        return randomNumberSample;
    }

    public static List<Integer> getRandomNumberAsList(int sampleSize, int variance) {
        List<Integer> randomNumberSample = new ArrayList<>(sampleSize);

        for (int i = 0; i < sampleSize; i++) {
            randomNumberSample.add((int)(Math.random() * variance + 1));
        }

        return randomNumberSample;
    }
}