package LinkedList;

public class main
{
    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.addFirst(10);
        ll.addFirst(100); // 100 -> 10 -> 5 -> 55 -> null
        ll.addLast(5);
        ll.addLast(55);
        ll.addIndex(2, 0);
        ll.addIndex(3, 3); // 2 100 10 3 5 55
        ll.display();
    }
}




