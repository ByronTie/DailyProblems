package byrontie;

import byrontie.Sorter;

public class BubbleSort implements Sorter {

    int[] sortedArray;

    public BubbleSort(int[] arrayToSort) {
        setSortedArray(arrayToSort);
    }

    public int[] sort() {
        
        int previous;

        if(sortedArray.length < 2) {
            return sortedArray;
        }

        for(int i = 0; i < sortedArray.length; i++) {
            previous = 0;

            for(int j = 0; j < (sortedArray.length - i); j++) {
                if(sortedArray[j] < previous) {
                    swapEntries(j, j - 1);
                }
                previous = sortedArray[j];
            }
        }

        return sortedArray;
    }

    private void setSortedArray(int[] sortedArray) {
        this.sortedArray = (sortedArray == null) ? (new int[0]) : sortedArray;
    }

    private void swapEntries(int firstIndex, int secondIndex) {
        int temp = sortedArray[firstIndex];
        sortedArray[firstIndex] = sortedArray[secondIndex];
        sortedArray[secondIndex] = temp;
    }
}