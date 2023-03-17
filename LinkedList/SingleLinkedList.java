package LinkedList;

public class SingleLinkedList
{
    private Node head;
    private Node tail;
    private int size;

    private class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }

        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value)
    {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void addLast(int value)
    {
        if (tail == null)
        {
            addFirst(value);
        }

        Node node = new Node(value);

        tail.next = node;
        tail = node;

        size++;
    }

    public void addIndex(int value, int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            addFirst(value);
            return;
        }

        if (index == size)
        {
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++)
        {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public Node findNodeByIndex(int index)
    {
        Node node = head;

        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        return node;
    }

    public Node findNodeByValue(int value)
    {
        Node node = head;

        while (node != null)
        {
            if (node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

}
