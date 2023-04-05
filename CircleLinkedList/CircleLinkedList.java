package CircleLinkedList;

public class CircleLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private class Node<E>
    {
        E element;
        Node<E> next;

        public Node(E e)
        {
            element = e;
        }
    }

    public CircleLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E e)
    {
        Node<E> node = new Node<E>(e);
        if (head == null)
        {
            head = node;
            tail = node;
            node.next = head;
        }
        else
        {
            node.next = head;
            head = node;
            tail.next = head;
        }
        size++;
    }

    public void addLast(E e)
    {
        Node<E> node = new Node<E>(e);
        if (tail == null)
        {
            head = node;
            tail = node;
            node.next = head;
        }
        else
        {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        size++;
    }

    public void addIndex(E e, int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            addFirst(e);
        }
        else if (index == size)
        {
            addLast(e);
        }
        else
        {
            Node<E> node = new Node<E>(e);
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            size++;
        }
    }

    public E removeFirst()
    {
        if (head == null)
        {
            return null;
        }
        else
        {
            Node<E> temp = head;
            head = head.next;
            tail.next = head;
            size--;
            if (head == null)
            {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast()
    {
        if (tail == null)
        {
            return null;
        }
        else
        {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
            {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = head;
            size--;
            if (tail == null)
            {
                head = null;
            }
            return temp.element;
        }
    }

    public E removeIndex(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            return removeFirst();
        }
        else if (index == size - 1)
        {
            return removeLast();
        }
        else
        {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }

    public int size()
    {
        return size;
    }

    public void printList()
    {
        Node<E> current = head;
        for (int i = 0; i < size; i++)
        {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node<E> findNode(E e)
    {
        Node<E> current = head;
        for (int i = 0; i < size; i++)
        {
            if (current.element.equals(e))
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node<E> findNode(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }

}