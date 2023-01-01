package linkedLists;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(4);
        // list.addAt(390, 5);
        System.out.println("Current Node" + list.size);

        try {
            int i = list.size() - 1;
            while (i >= 0) {
                System.out.println(list.get(i));
                i--;
            }
        } catch (Exception e) {
        }
    }
}
