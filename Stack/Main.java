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
        stack.display();
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.makeEmpty();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}
