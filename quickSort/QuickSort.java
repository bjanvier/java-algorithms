package quickSort;

import java.util.*;

/**
 * @author Janvier Zagabe
 * 
 *         QuickSort algorithm is a computing solving technique that
 *         divides an array into two sub-arrays.
 *         One array will contain the smaller values, and
 *         the other will contain the larger ones.
 *         Then, each chunk should be sorted independently.
 *         At the end, both partitions should be merged together
 *         Starting from the small chunk array if the order has to be ascending,
 *         otherwise if the order has to be descending.
 */
public class QuickSort {
    int[] arr = {};

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public int getSmallestNumber(List<Integer> list) {
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (i + 1 <= list.size() - 1) {
                int next = list.get(i + 1);

                if (smallest > next)
                    smallest = next;
            }
        }
        return smallest;
    }

    public List<Integer> sortList(List<Integer> list) {

        ArrayList<Integer> sortList = new ArrayList<>();

        while (list.size() - 1 >= 0) {
            int count = list.indexOf(getSmallestNumber(list));

            sortList.add(getSmallestNumber(list));

            if (list.contains(getSmallestNumber(list))) {
                list.remove(count);
            }
        }
        return sortList;
    }

    public int findLargestValue(int[] arr) {
        int largestNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length - 1 && arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    private List<Integer>[] generatePartitions() {

        int target = arr[arr.length / 2];

        List<Integer> largerValues = new ArrayList<>();
        List<Integer> smallerValues = new ArrayList<>();

        List<Integer>[] partitionsTuple = new ArrayList[2];

        try {
            for (int i = 0; i < arr.length; i++) {
                if (target < arr[i]) {
                    largerValues.add(arr[i]);
                } else {
                    smallerValues.add(arr[i]);
                }
            }

            partitionsTuple[0] = sortList(smallerValues);
            partitionsTuple[1] = sortList(largerValues);

        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        }
        return partitionsTuple;
    }

    public void mergePartitions() {
        List<Integer>[] partitions = generatePartitions();

        List<Integer> sortedList = new ArrayList<>(partitions[0].size() + partitions[1].size());

        for (int smallValue : partitions[0]) {
            sortedList.add(smallValue);
        }

        for (int largeValue : partitions[1]) {
            sortedList.add(largeValue);
        }
        System.out.println("Quick Sort");
        System.out.println(sortedList);
    }
}
