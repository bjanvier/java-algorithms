package stackAndQueue;

import java.util.NoSuchElementException;

/**
 * According to the book Big Java by Cay S. Horstmann,
 * a circular array implementation would provide a better
 * performance while removing an item at the end of the array.
 * That means, increment the head index by one for every element removal
 * 
 * Queue is a First-In-First-Out design. This Queue as circular array algorithm
 * is O(1)+ when adding and removing items
 */
@SuppressWarnings("unchecked")
public class CircularQueueArray<T> {
    T[] array = (T[]) new Object[] {};
    private int head = 0;

    public T removeFirst() {
        if (array.length == 0) {
            throw new NoSuchElementException();
        }
        T firstElement = array[head];
        head += 1;

        return firstElement;
    }

    public void addFirst(T element) {
        T[] newArray = (T[]) new Object[array.length + 1];
        newArray[array.length] = element;

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        head = 0; // reset the head
        array = newArray;
    }

    public int size() {
        return array.length;
    }
}
