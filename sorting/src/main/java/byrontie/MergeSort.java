package byrontie;

import java.util.ArrayList;
import java.util.List;
import byrontie.Sorter;

public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

    public void sort(List<T> listToSort) {

        if(listToSort.isEmpty() || listToSort.size() == 1) {
            return;
        }

        List<T> result = mergeSort(listToSort);
        listToSort.clear();
        listToSort.addAll(result);
    }

    private List<T> mergeSort(List<T> listToSort) {

        int midPoint = listToSort.size()/2;
        List<T> left = listToSort.subList(0, midPoint);
        List<T> right = listToSort.subList(midPoint, listToSort.size());
        List<T> leftResult = new ArrayList<>(left.size());
        List<T> rightResult = new ArrayList<>(right.size());

        if(left.size() > 1) {
            leftResult.addAll(mergeSort(left));
        } else {
            leftResult.addAll(left);
        }

        if(right.size() > 1) {
            rightResult.addAll(mergeSort(right));
        } else {
            rightResult.addAll(right);
        }

        List<T> result = new ArrayList<>(listToSort.size());
        while(!leftResult.isEmpty() && !rightResult.isEmpty()) {
            T leftEntry = leftResult.get(0);
            T rightEntry = rightResult.get(0);

            if(leftEntry.compareTo(rightEntry) < 0) {
                result.add(leftEntry);
                leftResult.remove(0);   
            } else {
                result.add(rightEntry);
                rightResult.remove(0);  
            }
        }

        if(leftResult.isEmpty()) {
            result.addAll(rightResult);
        }

        if(rightResult.isEmpty()) {
            result.addAll(leftResult);
        }

        return result;
    }

}