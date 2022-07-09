package selectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends SelectionSort {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 54, 1, -12, -5));

        System.out.println("Selection sort");
        System.out.println(sort.sort(list));
    }
}
