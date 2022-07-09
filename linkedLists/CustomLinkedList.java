package linkedLists;

class Node<T> {
    Node<T> next = null;
    T data;

    Node(T data, Node<T> next) {
        this.next = next;
        this.data = data;
    }
}

public class CustomLinkedList<T> {

    @SuppressWarnings("unchecked")
    int size = 0;
    private Node<T> node = new Node<>(null, null);

    public CustomLinkedList() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        try {
            for (int i = 0; i < size; i++) {
                sb.append(get(i));
                if (i < size() - 1) {
                    sb.append(", ");
                }
            }
        } catch (NullPointerException e) {
            System.err.println(e);
        }
        sb.append("]");
        return sb.toString();
    }

    public Node<T> generateNode(T item, Node<T> node) {
        try {
            if (node.data == null) {
                node.data = item; // 1
                // Meaning next may be null
            } else if (node.next == null) {
                System.out.println("node.next is null");
                Node<T> nextNode = new Node<>(node.data, null);
                node.next = nextNode;
                node.data = item;

            } else if (item != node.next.data && size > 1) {
                node.next.data = node.data;
                node.data = item;
            }

            // TODO:
            // Create a constructor that
            // doesn't return both the data
            // and the next node data.
            // We only need the next data
            // passed in the @next Object
            // constructor below
            Node<T> next = node; // node.next
            node = new Node<>(item, next);

            size++;
        } catch (Exception e) {
            System.err.println(e);
        }
        return node;
    }

    public void add(T item) {
        node = generateNode(item, node);
    }

    /**
     * Insert new node between two existing nodes.
     * The update will only affect the neighboring nodes references
     * 
     * @param item
     * @param index
     */
    @SuppressWarnings("unchecked")
    public void addAt(T item, int index) {
        if (size <= 1) {
            size = index;
            add(item);
        } else {
            if (index >= size) {
                throw new NullPointerException();
            }

            try {
                // temporary array to persist changes
                // until the item is merged into the current
                // list
                T[] temp = (T[]) new Object[size + 1];

                // Get all the nodes before
                // the @index parameter
                int k = 0;
                while (k < index) {
                    temp[k] = get(k);
                    k++;
                }

                // Insert the item between
                // index-1 and index+1
                temp[index] = item;

                // Add the item that comes after
                // the @index parameter
                for (k = index; k < size; k++) {
                    temp[k + 1] = get(k);
                }

                // Update the node
                node = new Node<>(null, null);

                // Only the references of the node that comes before and after
                // the @index will be updated
                for (int ii = 0; ii < temp.length; ii++) {
                    add(temp[ii]);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public T get(int index) {
        return getNext(index, node);
    }

    public T getNext(int index, Node<T> node) {
        int count = 0;

        Node<T> n = node;
        while (index >= 1 && index >= count) {
            if (n.next == null) {
                throw new NullPointerException();
            }
            n = n.next;
            count++;
        }
        return n.data;
    }

    public void set(int index, T value) {
        // TODO document why this method is empty
    }

    public void remove(int index) {
        // TODO document why this method is empty
    }

    public void peek() {
        // TODO document why this method is empty
    }

    public int size() {
        return size;
    }
}
