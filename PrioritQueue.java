

public class PrioritQueue
{
    Node front;
    int size = 0;

    private class Node
    {
        String value;
        int priority;
        Node next;

        public Node(String val, int priority)
        {
            this.value = val;
            this.priority = priority;
        }

        public Node(String val, int priority, Node next)
        {
            this.value = val;
            this.priority = priority;
            this.next = next;
        }
    }

    boolean isEmpty()
    {
        return front == null || size == 0;
    }

    void enqueue(String val, int priority)
    {
        Node node = new Node(val, priority);
       
            Node temp = front;
            Node prev = null;
            while (temp != null && temp.priority > priority)
            {
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

    void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return;
        }
        front = front.next;
        size--;
    }

    void display()
    {
        Node temp = front;
        while (temp != null)
        {
            System.out.println(temp.value + " " + temp.priority);
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        PrioritQueue queue = new PrioritQueue();
        System.out.println("hi");

        queue.enqueue("AA", 10);
        queue.enqueue("BB", 15);
        queue.enqueue("CC", 9);
        queue.enqueue("DD", 20);
        queue.enqueue("EE", 5);
        queue.enqueue("FF", 7);

        queue.display();
    }

}
