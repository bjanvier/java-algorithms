package stackAndQueue;

import java.util.NoSuchElementException;

/**
 * Most of the implementation idea for this class
 * came from Big Java edition 6 by Cay S. Horstmann
 */
public class LinkedListStack<T> {
    protected Node node = new Node();

    public void push(T item) {
        Node newNode = new Node();
        newNode.data = item;
        // At first push, next.data should be null
        newNode.next = node;
        // update the first node with the new added data
        node = newNode;
    }

    public T pop() {
        if (node == null) {
            throw new NoSuchElementException();
        }
        // get the last inserted/pushed data
        T element = node.data;
        // update the current node by its next node
        node = node.next;
        return element;
    }

    final class Node {
        T data = null;
        Node next;
    }
}
