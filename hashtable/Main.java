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
                    System.out.print(lBuckets[i].get(j) + ", ");
                }
            }
        }
        System.out.println();
    }
}
