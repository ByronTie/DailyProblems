package byrontie;

import java.util.ArrayList;
import java.util.List;
import byrontie.Sorter;

// 2 hour development
public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

    public List<T> sort(List<T> listToSort) {

        if(listToSort.isEmpty() || listToSort.size() == 1) {
            return listToSort;
        }

        return mergeSort(listToSort);
    }

    private List<T> mergeSort(List<T> listToSort) {

        int midPoint = listToSort.size()/2;
        List<T> left = listToSort.subList(0, midPoint);
        List<T> right = listToSort.subList(midPoint, listToSort.size());

        if(left.size() > 1) {
            left = mergeSort(left);
        }

        if(right.size() > 1) {
            right = mergeSort(right);
        }

        return merge(left, right);
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < left.size() && rightIndex < right.size()) {
            T leftEntry = left.get(leftIndex);
            T rightEntry = right.get(rightIndex);

            if(leftEntry.compareTo(rightEntry) < 0) {
                result.add(leftEntry);
                leftIndex++;
            } else {
                result.add(rightEntry);
                rightIndex++;
            }
        }

        if(leftIndex == left.size()) {
            result.addAll(right.subList(rightIndex, right.size()));
        }

        if(rightIndex == right.size()) {
            result.addAll(left.subList(leftIndex, left.size()));
        }

        return result;
    }
}