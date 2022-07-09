package binarySearch;

/**
 * Binary Search is an algorithm (divide-conquer) that consists of searching
 * an index from the middle of an array.
 * That being said, diving the array by 2 and check is the middle index
 * is the match, if that's not the case,
 * then loop through the first half of the array,
 * if nothing is found, then dive the other half of the array.
 * If the index is not matched with anything from the array, then the program
 * would return -1
 */
class Student {
    String fullName;
    int age;

    Student() {
    }

    Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}

public class BinarySearch {
    /**
     * Because the students array size is uneven, the middle
     * index will be:
     * int mid = students.size()/2 + 1;
     */
    int getMiddleIndex(Student[] array) {
        int middle = 0;
        if ((array.length % 2) != 0) {
            // The middle index when the array size is odd
            middle = (array.length / 2) + 1;
        } else {
            // Middle index when the array size is even
            middle = (array.length / 2);
        }
        return middle;
    }

    int getLowerHalf(Student[] array, int index) {
        int half = (array.length / 2) + 1;

        if (index == half) {
            System.out.println("Found the middle index");
            return index;
        } else {
            int count = 0;

            while (array.length > count) {
                if (count == index) {
                    if (count < half) {
                        System.out.println("Found in lower half");
                        return index;
                    } else {
                        System.out.println("Found in upper half");
                        return index;
                    }
                }
                count++;
            }
        }
        return -1;
    }
}