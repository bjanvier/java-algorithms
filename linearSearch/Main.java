package linearSearch;

public class Main {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        System.out.println("Binary Search without an array");
        System.out.println("name: " + linearSearch.findName(3).name);
        System.out.println("\nage: " + linearSearch.findName(3).age);
    }
}
