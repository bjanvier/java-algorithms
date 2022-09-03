package trees.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Every node in the tree has at most two children
 */
public class BinaryTree {
    final Object[] array = {};
    public Node root;
    private int size;

    public BinaryTree(Object data) {
        root.data = data;
        List<BinaryTree> children = new ArrayList<>(2);
    }

    private class Node {
        public Object data;
        List<BinaryTree> children;
    }

    /**
     * 
     * We will be adding at teh end where the unbalanced occurs.
     * That means, if at 4th index we have something like this:
     * arr[][] = [[0,1], [[1,2],[[2,3], []];
     * Then we will be adding the first two data from the array
     * data at arr[4][arr.length - 1],
     * and all data from index 3 from data[] will be added at the next
     * child-tree. We will do so until the data[] is empty
     */
    public void balancedAdd(Object... data) {
        Node newNode = new Node();
        newNode.data = data[0];

        // We need to add two children for each targeted node
        if (data.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid length of the array argument. The length should be even");
        }

        int count = 0;
        while (count < size) {

            count++;
        }
        size++;
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

    public int size() {
        return size;
    }
}
