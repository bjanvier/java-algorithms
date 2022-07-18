package abstracts;

@SuppressWarnings("unchecked")
public abstract class ArrayProps<T> {
    protected T[] array = (T[]) new Object[] {};

    public void push(T newValue) {
        T[] arr1 = (T[]) new Object[array.length + 1];
        int count = 0;
        arr1[array.length] = newValue;

        if (newValue == null) {
            throw new NullPointerException();
        }
        while (count < array.length) {
            arr1[count] = array[count];
            count++;
        }
        array = arr1;
    }

    public void push(T newValue, T[] arr) {
        T[] arr1 = (T[]) new Object[arr.length + 1];
        int count = 0;
        arr1[arr.length] = newValue;

        if (newValue == null) {
            throw new NullPointerException();
        }
        while (count < arr.length) {
            arr1[count] = arr[count];
            count++;
        }
        arr = arr1;
    }

    public void pop() {
        T[] newArray = (T[]) new Object[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                newArray[i] = array[i];
            }
        }
        array = newArray;
    }

    public void delete(int index) {
        T[] newArray = (T[]) new Object[array.length - 1];

        try {
            for (int i = 0; i < array.length; i++) {
                if (i != index && array[i] != null) {
                    newArray[i] = array[i];
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
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
