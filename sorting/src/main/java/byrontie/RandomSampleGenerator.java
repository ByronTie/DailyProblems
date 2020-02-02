package byrontie;

public class RandomSampleGenerator {
    public static int[] getRandomNumberSample(int sampleSize, int variance) {
        int[] randomNumberSample = new int[sampleSize];

        for (int i = 0; i < randomNumberSample.length; i++) {
            randomNumberSample[i] = (int)(Math.random() * variance + 1);
        }

        return randomNumberSample;
    }
}