package Queue;

public class DeQueue
{
    Node rear;
    Node front;
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
    }

    boolean isEmpty()
    {
        return front == null || size == 0;
    }

    void enqueueRear(int val)
    {
        Node node = new Node(val);
        if (isEmpty())
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        size++;
    }

    void dequeueFrontTwice()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        else if (size == 2)
        {
            front = null;
            rear = null;
        }
        else
        {
            front = front.next.next;
            front.prev = null;
            
        }
        size -= 2;
    }

    void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        DeQueue Q1 = new DeQueue();

        Q1.enqueueRear(2);
        Q1.enqueueRear(2);
        Q1.enqueueRear(1);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);
        Q1.enqueueRear(0);

        Q1.dequeueFrontTwice();
        Q1.dequeueFrontTwice();
        Q1.dequeueFrontTwice();


        Q1.display();

    }

}
