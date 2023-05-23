package Stack;

public class StackList<T>
{
    private Node top;
    private int size;

    public StackList()
    {
        top = null;
        size = 0;
    }

    private class Node
    {
        T data;
        Node next;

        public Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            T value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }

    public T top()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            return top.data;
        }
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void display()
    {
        Node temp = top;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void makeEmpty()
    {
        top = null;
        size = 0;
    }

}