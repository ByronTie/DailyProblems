package byrontie;

import java.util.List;

public abstract class TestBase {

    protected <T> void printArray(List<T> list) {
        for(T i: list) {
            System.out.print(i.toString() + ", ");
        }
        System.out.println();
    }

    protected boolean isSorted(List<Integer> sortedList) {
        if(sortedList.isEmpty() || sortedList.size() == 1) {
            return true;
        }

        for (int i = 1; i < sortedList.size(); i++) {
            if(sortedList.get(i) < sortedList.get(i - 1)) {
                System.out.println("The following collection was not sorted correctly.");
                printArray(sortedList);
                return false;
            }
        }

        return true;
    }
}