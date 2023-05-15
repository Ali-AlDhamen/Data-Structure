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

    // dequeue and enqueue in circular linked list
    void enqueueCircular(int val)
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
        rear.next = front;
        size++;
    }

    void dequeueCircular()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
        front = front.next;
        rear.next = front;
        size--;
        if (isEmpty())
        {
            rear = null;
        }
    }
    int front(){
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return -1;
        }
        return front.value;
    }

    int rear(){
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return -1;
        }
        return rear.value;
    }

    void printCircular()
    {
        Node temp = front;
        do {
            System.out.print(temp.value + " ");
            temp = temp.next;
        } while (temp != front);
    
        System.out.println();
    }

    public static void main(String[] args)
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueueCircular(10);
        queue.enqueueCircular(20);
        queue.enqueueCircular(30);

        queue.printCircular();

        queue.dequeueCircular();

        queue.printCircular();

        queue.enqueueCircular(40);
        queue.enqueueCircular(50);

        queue.printCircular();

    }

}
