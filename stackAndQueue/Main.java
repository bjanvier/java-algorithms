package stackAndQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueueArray<Integer> stackQA = new CircularQueueArray<>();

        stackQA.addFirst(0);
        stackQA.addFirst(1);
        stackQA.addFirst(2);
        stackQA.addFirst(3);
        stackQA.addFirst(4);
        stackQA.addFirst(5);
        stackQA.addFirst(6);
        stackQA.addFirst(7);
        stackQA.addFirst(8);
        stackQA.addFirst(9);

        for (int i = 0; i < stackQA.size(); i++) {
            System.out.println(stackQA.removeFirst());
        }
        // System.out.println(stackQA.r
        // System.out.println("Stack array list");
        ArrayListStack<Integer> stackAL = new ArrayListStack<>();

        // stackAL.push(2);
        // stackAL.push(2);
        // stackAL.push(343);

        // System.out.println(stackAL.size());
        // System.out.println(stackAL.pop());

        // System.out.println("Stack Linked list");
        LinkedListStack<String> stackLL = new LinkedListStack<>();

        // stackLL.push("First");
        // stackLL.push("Second");
        // stackLL.push("3rd");
        // stackLL.push("4th");
        String last = stackLL.pop();

        // Testing next trees data...
        // System.out.println(last);
        // System.out.println(stackLL.node.data);
        // System.out.println(stackLL.node.next.data);
        // System.out.println(stackLL.node.next.next.data);
    }
}
