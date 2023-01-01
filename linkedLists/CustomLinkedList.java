package linkedLists;

class Node<T> {
    T data;
    Node<T> next = null;

    Node(T data, Node<T> next) {
        this.next = next;
        this.data = data;
    }
}

@SuppressWarnings("unchecked")
public class CustomLinkedList<T> {
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

    public void add(T item) {
        if (node.data == null) {
            node.data = item;
            node.next = null;
        }
        Node<T> next = node;
        node = new Node<>(item, next);
        size++;
    }

    /**
     * Insert new node between two existing nodes.
     * The update will only affect the neighboring nodes references
     * 
     * @param item
     * @param index
     */
    public void addAt(T item, int index) {
        if (size <= 1) {
            size = index;
            add(item);
        } else {
            if (index >= size) {
                throw new IndexOutOfBoundsException();
            }
            try {
                // temporary array to persist changes until
                // the item is merged into the current list
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
                // Update/Reset the node
                node = new Node<>(null, null);

                // Only the references of the node that comes
                // before and after the @index will be updated
                for (int ii = 0; ii < temp.length; ii++) {
                    add(temp[ii]);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public T get(int index) {
        int count = index;
        Node<T> n = node;
        // while (index > count) {
        while (count > 0) {
            if (n.next == null) {
                // throw new NullPointerException("Node next is null");
                System.out.println("Next node is null");
            }
            n = n.next;
            count--;
        }
        return n.data;
    }

    public void set(int index, T value) {
        // TODO document why this method is empty
    }

    public void remove(int index) {
        if (index >= size) {
            throw new NullPointerException();
        }

        int count = size - 1;
        int i = index;
        CustomLinkedList rightNodes = new CustomLinkedList<T>();
        CustomLinkedList leftNodes = new CustomLinkedList<T>();
        CustomLinkedList n = new CustomLinkedList<T>();
        // Get the nodes before index
        while (i > 0) {
            leftNodes.add(this.get(count));
            count--;
            i--;
        }

        // Skip the node we are removing
        int j = index + 2;
        // Get the nodes after index by skipping
        // the node that need to be removed
        while (j <= size) {
            count--;
            rightNodes.add(get(count));
            j++;
        }

        // Merge both nodes and update the current node
        int l = leftNodes.size() - 1;
        int r = rightNodes.size() - 1;

        while (l >= 0) {
            n.add(leftNodes.get(l));
            l--;
        }

        while (r >= 0) {
            n.add(rightNodes.get(r));
            r--;
        }

        i = n.size() - 1;
        System.out.println("Current new node: " + n.size);
        while (i >= 0) {
            System.out.println(n.get(i));
            i--;
        }
        size = n.size();
        this.setNode(n.node);
    }

    public void setNode(Node<T> n) {
        node = n;
    }

    public void peek() {
        // TODO document why this method is empty
    }

    public int size() {
        return size;
    }
}
