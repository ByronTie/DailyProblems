package byrontie;

import java.util.List;
import byrontie.Sorter;

public class BubbleSort<T extends Comparable<T>> implements Sorter<T> {

    public BubbleSort() {}

    public List<T> sort(List<T> listToSort) {
        
        if(listToSort.isEmpty() || listToSort.size() == 1) {
            return listToSort;
        }

        for(int i = 0; i < listToSort.size(); i++) {
            for(int j = 1; j < listToSort.size(); j++) {
                if(listToSort.get(j).compareTo(listToSort.get(j - 1)) < 0) {
                    swapEntries(listToSort, j - 1, j);
                }
            }
        }

        return listToSort;
    }

    private void swapEntries(List<T> list, int indexPrev, int indexCurrent) {
        T temp = list.get(indexCurrent);
        list.set(indexCurrent, list.get(indexPrev));
        list.set(indexPrev, temp);
    }
}