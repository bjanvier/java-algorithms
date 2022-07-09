package binarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        Student[] student = {
                new Student("Grace Bahoya", 23),
                new Student("Clara Bahoya", 21),
                new Student("Benita Bahoya", 18),
                new Student("Berjaude Muamba", 24),
                new Student("Samira Bezzaz", 24),
                new Student("Grace Bahoya", 29),
                new Student("JiaYu Messi", 25),
                new Student("Fouiny Fouiny", 29),
                new Student("Koko Kosmas", 31),
                new Student("Nicole Kasongo", 21),
                new Student("Serge Bogota", 19),
                new Student("Fernando Feliz", 18),
                new Student("Lyly Bella", 25),
        };

        System.out.println("Binary Search");
        try {
            System.out.println((binarySearch.getLowerHalf(student, 8)));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
