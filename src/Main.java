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
    }
}