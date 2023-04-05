package CircleLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        CircleLinkedList<Integer> cc = new CircleLinkedList<Integer>();
        cc.addFirst(1);
        cc.addFirst(2);
        cc.addFirst(3);
        cc.addFirst(4);
        cc.addLast(5);
        cc.addLast(6);
        cc.addLast(7);
        cc.printList();
    }
}