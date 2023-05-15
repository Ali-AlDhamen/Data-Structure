package Queue;

public class PriorityQueue
{
    Node front;
    int size = 0;

    private class Node
    {
        String value;
        int key;
        Node next;

        public Node(String val, int key)
        {
            this.value = val;
            this.key = key;
        }

        public Node(String val, int key, Node next)
        {
            this.value = val;
            this.key = key;
            this.next = next;
        }
    }

    boolean isEmpty()
    {
        return front == null || size == 0;
    }

    void enqueue(String val, int key)
    {
        Node node = new Node(val, key);

        Node temp = front;
        Node prev = null;
        while (temp != null && temp.key > node.key)
        {
            System.out.println("temp: " + temp.value);
            prev = temp;
            temp = temp.next;
        }
        if (prev == null)
        {
            front = node;
        }
        else
        {
            prev.next = node;
        }
        node.next = temp;

        size++;
    }

    String dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return null;
        }
        String val = front.value;
        front = front.next;
        size--;
        return val;

    }

    Node getMaxNode()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return null;
        }
        return front;

    }

    void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
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
        PriorityQueue queue = new PriorityQueue();


        queue.enqueue("AA", 10);
        queue.enqueue("BB", 15);
        queue.enqueue("CC", 9);
        queue.enqueue("DD", 20);
        queue.enqueue("EE", 5);
        queue.enqueue("FF", 7);

        queue.display();
    }

}
