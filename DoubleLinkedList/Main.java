package DoubleLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        DoubleCircleLinkedList list = new DoubleCircleLinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(3);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printInForward();
        list.printInBackward();

    }
}