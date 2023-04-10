package Stack;

public class StackList
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
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }

    public int top()
    {
        if (top == null)
        {
            System.out.println("Stack is empty");
            return -1;
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
