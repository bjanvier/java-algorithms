package arrayLists;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven", 3);
        list.add("eight", 6);
        list.remove(0);
        list.add("Zagabe", 0);
        list.set(0, "Janvierr");
        list.addAll("nine", "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen");
        System.out.println(list.get("One"));
        System.out.println(list.get(0) + "here");
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Zero"));
        System.out.println(list.containsAll("Zero", "One", "Two2", "Three", "Four"));
        System.out.println(list);
    }
}
