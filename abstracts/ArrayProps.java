package abstracts;

@SuppressWarnings("unchecked")
public abstract class ArrayProps<T> {
    public T[] array = (T[]) new Object[] {};

    public ArrayProps() {
    }

    public void push(T newValue) {
        T[] arr1 = (T[]) new Object[array.length + 1];
        arr1[array.length] = newValue;
        int count = 0;

        while (count < array.length) {
            arr1[count] = array[count];
            count++;
        }
        array = arr1;
    }

    public void pop() {
        T[] newArray = (T[]) new Object[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                newArray[i] = array[i];
            }
        }

        array = (T[]) new Object[newArray.length];
        array = newArray;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
