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

    void enqueueLinear(int val)
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

    void enqueueCircular(int val)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = val;
        rear = (rear + 1) % queue.length;
        size++;
    }

    void deQueueLinear(int val)
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

    int deQueueCircular()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return val;
    }

    int front()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    int rear()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        if (rear == 0)
        {
            return queue[queue.length - 1];
        }
        return queue[rear - 1];
    }

    void print()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do
        {

            System.out.print(queue[i] + " -> ");
            i = (i + 1) % queue.length;
        } while (i != rear);

        System.out.println("END");

    }

    public static void main(String[] args)
    {
        QueueArray q = new QueueArray(5);
        q.enqueueCircular(1);
        q.enqueueCircular(2);
        q.enqueueCircular(3);
        q.enqueueCircular(4);
        q.enqueueCircular(5);


        q.deQueueCircular();
        q.deQueueCircular();
        q.deQueueCircular();
        q.deQueueCircular();
        q.print();

    }

}
