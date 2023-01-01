package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    List<Object> nodeData = new ArrayList<>();
    Node node;
    int length = 0;

    class Node {
        Object data = null;
        List<Node> nodes = new LinkedList<>();
        boolean visited = false;

        Node(Object data, List<Node> nodes, boolean visited) {
            this.data = data;
            this.nodes = nodes;
            this.visited = visited;
        }
    }

    /***
     * TODO
     * Insert data to the tree
     * 
     * @param node
     */
    public void insert(Node node) {

    }

    public int size() {
        return length;
    }

    /**
     * Helper function to traverse the tree and add every present
     * data to @nodeData array
     * 
     * @param tree
     */
    private void getData(Node tree) {
        if (!tree.visited) {
            nodeData.add(tree.data);
            tree.visited = true;
        }

        if (!tree.nodes.isEmpty()) {
            this.getData(tree.nodes.get(0));
            tree.nodes.remove(0);
        }
        length++;
    }

    public void traverse() {
        this.getData(node);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object data : nodeData) {
            sb.append(data);
        }
        sb.append("]");

        return sb.toString();
    }

    public void BFS(Visitor v) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean more = true;
        while (more && q.size() > 0) {
            Node n = q.remove();
            more = v.visit(n.data);
            if (more) {
                for (Node c : n.children) {
                    q.add(c);
                }
            }
        }
    }
}
