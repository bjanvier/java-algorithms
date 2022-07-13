package stackAndQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack array list");
        ArrayListStack<Integer> stackAL = new ArrayListStack<>();

        stackAL.push(2);
        stackAL.push(2);
        stackAL.push(343);

        System.out.println(stackAL.size());
        System.out.println(stackAL.pop());

        System.out.println("Stack Linked list");
        LinkedListStack<String> stackLL = new LinkedListStack<>();

        stackLL.push("First");
        stackLL.push("Second");
        stackLL.push("3rd");
        stackLL.push("4th");
        String last = stackLL.pop();

        // Testing next trees data...
        System.out.println(last);
        System.out.println(stackLL.node.data);
        System.out.println(stackLL.node.next.data);
        System.out.println(stackLL.node.next.next.data);
    }
}
