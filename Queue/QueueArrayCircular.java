package Queue;

public class QueueArrayCircular
{
    private int size;
    private int front;
    private int rear;
    private String queue[];

    QueueArrayCircular(int size)
    {
        this.size = 0;
        front = 0;
        rear = 0;
        queue = new String[size];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == queue.length;
    }

    public void enqueue(String val)
    {
        if (isFull())
        {
            System.out.println("Queue is overflow");
            return;
        }
        queue[rear] = val;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public String deQueue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is underflow");
            return null;
        }
        String val = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return val;
    }

    public String front()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[front];
    }

    public String rear()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        if (rear == 0)
        {
            return queue[queue.length - 1];
        }
        return queue[rear - 1];
    }

    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do
        {

            System.out.println(i + 1 + "." + queue[i]);
            i = (i + 1) % queue.length;
        } while (i != rear);
        System.out.println();

    }

    public static void main(String[] args)
    {
        QueueArrayCircular queue = new QueueArrayCircular(5);
        // enqueue all orders
        queue.enqueue("install App");
        queue.enqueue("Create Account");
        queue.enqueue("Login");
        queue.enqueue("Apply job-1");
        queue.enqueue("Sign out");

        // display all orders
        queue.display();

        // dequeue first 2 orders
        queue.deQueue();
        queue.deQueue();

        // display all orders
        queue.display();

    }

}
