package hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable<Object> table = new HashTable<>();
        Object[] arr = { 1243, 345, true, false, "W", "hahas", "LOL", "Jesus is Our Savior" };

        Object[] arr1 = table.linearProbing(arr);

        // System.out.println(arr.length);
        // System.out.println(table.linearProbing(arr).length);

        System.out.println("Before converting to hash table using liner probing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("\n\nAfter converting to hash table using liner probing");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // System.out.println(arr.length);
        // System.out.println(table.compress("VII", arr.length));
        // System.out.println(table.compress(33, arr.length));

        // Same hash codes
        // System.out.println(table.generateHashCode("VII"));
        // System.out.println(table.generateHashCode("Ugh"));
        // System.out.println("Ugh".hashCode());

    }
}
