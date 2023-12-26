import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(15);
        list.addLast(2);
        list.addLast(8);
        list.addFirst(1);
        System.out.println(list.getOfIndex(0));
        System.out.println(list.getOfIndex(1));
        System.out.println(list.getOfIndex(2));
        System.out.println(list);
        System.out.println(list.size);

        System.out.println("________________________________");

        MyLinkedList<String> list2 = new MyLinkedList<>();
        list2.addLast("15");
        list2.addLast("sdfjsdfdfsf");
        list2.addFirst("строка");
        System.out.println(list2.getOfIndex(0));
        System.out.println(list2.getOfIndex(1));
        System.out.println(list2.getOfIndex(2));
        System.out.println(list2);
        System.out.println(list2.size);
    }
}