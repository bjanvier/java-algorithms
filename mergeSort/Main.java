package mergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-145, 5, 14, 2));

        System.out.println(merge.getMergedList(list));
    }
}
