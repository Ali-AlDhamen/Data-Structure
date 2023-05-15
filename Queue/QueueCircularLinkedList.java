package Queue;

public class QueueCircularLinkedList
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
        rear.next = front;
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
        rear.next = front;
        size--;
        if (isEmpty())
        {
            rear = null;
        }
    }

    int front()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return -1;
        }
        return front.value;
    }

    int rear()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return -1;
        }
        return rear.value;
    }

    void print()
    {
        Node temp = front;
        do
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }
    public static void main(String[] args) {
        QueueCircularLinkedList queue = new QueueCircularLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.print();
        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }
}
