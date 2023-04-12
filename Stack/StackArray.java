package Stack;

public class StackArray
{

    private int[] stack;
    private int top;

    public StackArray(int size)
    {
        stack = new int[size];
        top = -1;
    }

    public void push(int value)
    {
        if (top == stack.length - 1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            stack[++top] = value;
        }
    }

  

    public int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }

    public int top()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top];
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == stack.length - 1;
    }

    public int size()
    {
        return top + 1;
    }

    public void display()
    {
        for (int i = top; i >= 0; i--)
        {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    void makeEmpty()
    {
        top = -1;
    }

}
