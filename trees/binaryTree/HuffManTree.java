package trees.binaryTree;

public class HuffManTree {
    private Tree root;
    private int pathLength;

    private class Tree {
        public Tree left;
        private Tree right;
        private Object data;
    }

    public Tree add(Object rightData, Object leftData) {
        Tree hTree = new Tree();
        hTree.right = root.right;
        hTree.left = root.left;

        return root;
    }

    public void decisionTree(Object data) {

    }
}
