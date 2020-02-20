package byrontie;

import java.util.List;

public interface Sorter<T extends Comparable<T>> {
    List<T> sort(List<T> listToSort);
}