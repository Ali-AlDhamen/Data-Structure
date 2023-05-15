package Queue;

public class QueueArrayCircular {
    private int size;
    private int front;
    private int rear;
    private int queue[];

    QueueArrayCircular(int size)
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

    public static void main(String[] args) {
        
    }

}
