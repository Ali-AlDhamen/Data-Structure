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
        return front == null || size == 0;
    }

    void enqueueFront(int val)
    {
        Node node = new Node(val);
        if (isEmpty())
        {
            front = node;
            rear = node;
        }
        else
        {
            node.next = front;
            front.prev = node;
            front = node;
        }
        size++;
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

    void dequeueFront()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
        front = front.next;
        front.prev = null;
        size--;
    }

    void dequeueRear()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
        rear = rear.prev;
        rear.next = null;
        size--;
    }

    void print()
    {
        Node temp = front;
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DeQueue queue = new DeQueue();
        queue.enqueueFront(10);
        queue.enqueueFront(20);
        queue.enqueueFront(30);
        queue.enqueueFront(40);
        queue.enqueueFront(50);

        queue.print();

        queue.dequeueFront();
        queue.dequeueFront();

        queue.print();

    }

}
