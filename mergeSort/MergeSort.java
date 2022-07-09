package mergeSort;

import java.util.*;

class MergeSort {
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

    /**
     * @param list a list of integers to be sorted
     * @return a sorted new array of integers
     */
    public List<Integer> sortedList(List<Integer> list) {

        ArrayList<Integer> sortedList = new ArrayList<>();

        while (list.size() - 1 >= 0) {
            int count = list.indexOf(getSmallestNumber(list));

            sortedList.add(getSmallestNumber(list));

            if (list.contains(getSmallestNumber(list))) {
                list.remove(count);
            }
        }
        return sortedList;
    }

    public List<Integer> getLeftHalf(List<Integer> numbers) {
        ArrayList<Integer> leftHalf = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            leftHalf.add(numbers.get(i));
        }
        return sortedList(leftHalf);
    }

    public List<Integer> getRightHalf(List<Integer> numbers) {
        ArrayList<Integer> rightHalf = new ArrayList<>();
        // Get the right half
        for (int i = numbers.size() / 2; i < numbers.size(); i++) {
            rightHalf.add(numbers.get(i));
        }

        return sortedList(rightHalf);
    }

    public Set<Integer> getMergedList(List<Integer> list) {
        Set<Integer> mergedList = new HashSet<>();
        List<Integer> leftHalf = getLeftHalf(list);
        List<Integer> rightHalf = getRightHalf(list);
        int i = 0;
        int j = 0;

        try {
            while (leftHalf.size() - 1 >= i || rightHalf.size() - 1 >= j) {
                if (i >= leftHalf.size()) {
                    // Left half merge complete
                    for (Integer num : rightHalf) {
                        mergedList.add(num);
                    }
                }

                else if (j >= rightHalf.size()) {
                    // Right half merge complete
                    for (Integer num : leftHalf) {
                        mergedList.add(num);
                    }
                }

                if (rightHalf.get(j) < leftHalf.get(i)) {
                    mergedList.add(rightHalf.get(j));
                    j++;
                } else {
                    mergedList.add(leftHalf.get(i));
                    i++;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return mergedList;
    }
}