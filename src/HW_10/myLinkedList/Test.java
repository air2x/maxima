package HW_10.myLinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        System.out.println(list.size());
        System.out.println(list);
    }
}
