package stackAndQueue;

import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class ArrayListStack<T> {
    T[] array = (T[]) new Object[] {};

    public T pop() {
        if (array[array.length - 1] == null) {
            throw new NoSuchElementException();
        }
        T lastElement = array[array.length - 1];
        T[] newArray = (T[]) new Object[array.length - 1];
        int count = 0;

        while (count < array.length - 1) {
            newArray[count] = array[count + 1];
            count++;
        }
        array = newArray;
        return lastElement;
    }

    public void push(T element) {
        T[] newArray = (T[]) new Object[array.length + 1];

        newArray[array.length] = element;
        int count = 0;
        while (count < array.length - 1) {
            newArray[count] = array[count];
            count++;
        }
        array = newArray;
    }

    public int size() {
        return array.length;
    }
}
