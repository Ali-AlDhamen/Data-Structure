package Queue;

public class QueueLinkedList
{

    Node front;
    Node rear;
    int size;

    private class Node
    {
        int value;
        Node next;

        public Node(int val)
        {
            this.value = val;
        }

        public Node(int val, Node next)
        {
            this.value = val;
            this.next = next;
        }
    }

    QueueLinkedList()
    {
        front = null;
        rear = null;
        size = 0;
    }

    boolean isEmpty()
    {
        return front == null || size == 0;
    }

    void enqueue(int val)
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
            rear = node;
        }
        size++;
    }

    void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
        front = front.next;
        size--;
        if (isEmpty())
        {
            rear = null;
        }
    }

    void print()
    {
        Node temp = front;
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);

        queue.print();

    }

}
