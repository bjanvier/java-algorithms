package selectionSort;

import java.util.*;

class SelectionSort {
    /**
     * The secret of sorting an array is
     * to be able finding the smallest/largest element
     * value in the array of integers
     */
    public int min(List<Integer> list) {
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (i + 1 <= list.size() - 1) {
                int next = list.get(i + 1);
                if (smallest > next) {
                    smallest = next;
                }
            }
        }
        return smallest;
    }

    /**
     * @param list a list of integers to be sorted
     * @return a sorted new array of integers
     */
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();

        while (list.size() - 1 >= 0) {
            int count = list.indexOf(min(list));

            sortedList.add(min(list));
            if (list.contains(min(list))) {
                list.remove(count);
            }
        }
        return sortedList;
    }
}
