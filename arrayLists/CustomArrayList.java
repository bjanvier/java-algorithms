package arrayLists;

import java.util.*;
import abstracts.ArrayProps;

@SuppressWarnings("unchecked")
class CustomArrayList<T> extends ArrayProps<T> {
    public int size() {
        return array.length - 1;
    }

    public void add(T element) {
        push(element);
    }

    private void addFirst(T element) {
        T[] arr = (T[]) new Object[array.length + 1];
        arr[0] = element;

        for (int i = 0; i < array.length; i++) {
            arr[i + 1] = array[i];
        }
        array = arr;
    }

    // Insert a new element anywhere in the list
    public void add(T element, int index) {
        T[] arr = (T[]) new Object[array.length + 1];
        int half = (array.length - 1) / 2;
        int i = 0;

        if (index > array.length) {
            throw new IndexOutOfBoundsException("The index should be less than the size of the array.\n"
                    + "Array.length:" + array.length
                    + "\nindex" + index);
        }

        if (index == array.length) {
            push(element);
            return;
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        if (index <= half) {
            while (index >= i) {
                arr[i] = array[i];
                i++;
            }
            arr[index + 1] = element;

            int j = index + 2;

            while (j <= array.length) {
                arr[j] = array[j - 1];
                j++;
            }
        } else { // index > half
            int k = index;

            for (int i1 = 0; i1 < index; i1++) {
                arr[i1] = array[i1];
            }

            while (k < array.length) {
                arr[k + 1] = array[k];
                k++;
            }
            arr[index] = element;
        }
        array = arr;
    }

    /**
     * Java standard library implementation provides a Collection interface
     * to merge multiple elements into the original array list.
     * However, this implementation here will be all hard-coded.
     * 
     * @param collection
     */
    public void addAll(T... collection) {
        for (T element : collection) {
            push(element);
        }
    }

    public void remove(T element) {
        T[] arr = (T[]) new Object[array.length - 1];

        int i = 0;
        for (T elt : array) {
            if (!elt.equals(element)) {
                arr[i] = elt;
            }
            i++;
        }
        array = arr;
    }

    public void removeFirst() {
        T[] arr = (T[]) new Object[array.length - 1];
        int count = array.length - 1;

        for (int i = 0; i < count; i++) {
            // Already skipped the 1st element
            arr[i] = array[i + 1];
        }
        array = arr;
    }

    public void remove(int index) {
        T[] arr = (T[]) new Object[array.length - 1];
        Boolean isSmaller = false;
        int count = 0;

        if (index < 0) {
            throw new NullPointerException();
        }
        if (index >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == count) {
            removeFirst();
            return; // everything would be nullified if thus is commented out
        }
        // Quick divide-and-conquer algorithm
        if (count < index) {
            isSmaller = true;
            // Getting every element that comes before the
            // @index
            while (isSmaller) {
                arr[count] = array[count];
                // Prevent the addition of the array[index]
                if (count + 1 == index) {
                    isSmaller = false;
                }
                count++;
            }
            // After adding all the elements that come before the index, we
            // are going to add the ones that come after
            while (count < array.length - 1) {
                arr[count] = array[count + 1];
                count++;
            }
        }
        array = arr;
    }

    public boolean contains(T element) {
        Boolean included = false;
        for (T elt : array) {
            if (elt.equals(element)) {
                included = true;
                break;
            }
        }
        return included;
    }

    /**
     * @recap Java standard library uses Collection interface to provide
     *        this method with a syntax like the following:
     *        boolean containsAll(<?> Collection);
     *        However, we will hard-code this method here
     * 
     * @param collection can have as many elements as @array does.
     * 
     * @return If its length is bigger than @array.length, then it should
     *         automatically return false.
     *         If also only one of its elements is not present in the
     *         original @array,
     *         then the method should return false likewise.
     *         If all elements in the collection are included in @array,
     *         then the method should return true otherwise.
     */
    public boolean containsAll(T... collection) {
        Boolean allIncluded = true;
        if (collection.length <= array.length) {
            for (T elt : collection) {
                if (!contains(elt)) {
                    allIncluded = false;
                    break;
                }
            }
        }
        return allIncluded;
    }

    public T get(T element) {
        T elt = null;
        int i = 0;
        for (T item : array) {
            if (item.equals(element)) {
                elt = element;
                break;
            }
            // reached the end of array and not found
            if (i == array.length - 1)
                throw new NoSuchElementException();
            i++;
        }
        return elt;
    }

    public T get(int index) {
        T elt = null;
        if (index >= array.length - 1 || index < 0)
            throw new NoSuchElementException();
        for (T item : array) {
            if (item.equals(array[index])) {
                elt = array[index];
                break;
            }
        }
        return elt;
    }

    public void set(int index, T element) {
        if (index <= array.length - 1)
            array[index] = element;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }
}