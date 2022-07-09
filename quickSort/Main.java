package quickSort;

public class Main {

    public static void main(String[] args) {
    
        int[] arr = {
                1, 234343, 901, 984945,
                7, 5465, 456, 6, 99, 12,
                30000, 10000, -34
            };
        
        QuickSort quickSort = new QuickSort(arr);
        quickSort.mergePartitions();
    }
}
