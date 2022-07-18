package hashtable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        Object[] arr = { 1243, 345, true, false, "Janvier", "Zagabe",
                "Either Coding/Programming, or Soccer, Or nothing",
                "Jesus is Our Savior" };
        Object[] arr1 = table.linearProbing(arr);

        System.out.println("Before converting to hash table using liner probing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("\n\nAfter converting to hash table using liner probing");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        List<Object>[] lBuckets = table.separateChaining(arr);
        for (int i = 0; i < lBuckets.length; i++) {
            if (lBuckets[i] != null) {
                for (int j = 0; j < lBuckets[i].size(); j++) {
                    /**
                     * when h = 1,
                     * bucket[h] = [0:342, 1:"Janvier", 2:"Either Coding/Programming, or Soccer, Or
                     * nothing"];
                     * when h = 2,
                     * bucket[h] = [];
                     * when h = 3,
                     * bucket[h] = [1234];
                     * when h = 4,
                     * bucket[h] = [0:"Zagabe",1:"Jesus is Our Savior"];
                     * when h = 5,
                     * bucket[h] = [0:false];
                     * when h = 6,
                     * bucket[h] = [];
                     * and when h = 7,
                     * bucket[h] = [0:true];
                     * 
                     */
                    System.out.print(lBuckets[i].get(j));
                }
            }
        }
        System.out.println();
    }
}
