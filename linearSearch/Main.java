package linearSearch;

public class Main {
    
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        System.out.println("Binary Search without an array");
        System.out.println("The age \n" + linearSearch.getAge());
        System.out.println("Javascript CoFounder:\n");
        System.out.println("name: "+ linearSearch.findJSCoFounder().name);
        System.out.println("\nage: "+ linearSearch.findJSCoFounder().age);
    }
}
