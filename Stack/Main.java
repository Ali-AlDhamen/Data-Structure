package Stack;

public class Main
{
    public static void main(String[] args)
    {
        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.push(2);

        stack.push(3);

        stack.push(4);

        stack.push(5);
        stack.push(6);
        stack.print();
        System.out.println(stack.isFull());

    }
}
