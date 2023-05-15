package DoubleLinkedList;

public class DoubleCircleLinkedList
{

    Node head;
    Node tail;
    int size;

    private class Node
    {
        int value;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.value = val;
        }

        public Node(int val, Node next)
        {
            this.value = val;
            this.next = next;
        }

        public Node(int val, Node next, Node prev)
        {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    boolean isEmpty()
    {
        return head == null;
    }

    void addFirst(int val)
    {
        Node node = new Node(val);
        if (isEmpty())
        {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        }
        else
        {
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    void addLast(int val)
    {
        Node node = new Node(val);
        if (isEmpty())
        {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        }
        else
        {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    void add(int val, int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            addFirst(val);
        }
        else if (index == size)
        {
            addLast(val);
        }
        else
        {
            Node node = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
            size++;
        }
    }

    void removeFirst()
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException();
        }
        if (size == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }

    void removeLast()
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException();
        }
        if (size == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }

    void remove(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            removeFirst();
        }
        else if (index == size - 1)
        {
            removeLast();
        }
        else
        {
            Node temp = head;
            for (int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    void printInForward()
    {
        Node temp = head;
        for (int i = 0; i < size; i++)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    void printInBackward()
    {
        Node temp = tail;
        for (int i = 0; i < size; i++)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.print("START");
        System.out.println();
    }

    int findIndex(int val)
    {
        Node temp = head;
        for (int i = 0; i < size; i++)
        {
            if (temp.value == val)
            {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    Node findNode(int val)
    {
        Node temp = head;
        for (int i = 0; i < size; i++)
        {
            if (temp.value == val)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

}