package Queue;

public class QueueArray
{

    private int size;
    private int front;
    private int rear;
    private int queue[];

    QueueArray(int size)
    {
        this.size = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    boolean isFull()
    {
        return size == queue.length;
    }

    void enqueue(int val)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = val;
        rear += 1;
        size++;
    }

    void deQueue(int val)
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++)
        {
            queue[i] = queue[i + 1];
        }
        rear -= 1;
        size--;
    }

    void print()
    {
        for (int i = front; i < rear; i++)
        {
            System.out.print(queue[i] + " -> ");
        }
        System.out.println("END");
    }

    public static void main(String[] args)
    {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);

        q.enqueue(20);

        q.print();

    }

}
