package Stack;

public class Main
{
    public static void main(String[] args)
    {

        StackArray s1 = new StackArray(5);
        s1.push(1);
        System.out.println(s1.top());
        s1.push(2);
        System.out.println(s1.top());
        s1.push(3);
        System.out.println(s1.top());
        s1.push(4);
        System.out.println(s1.top());
        s1.push(5);
        System.out.println(s1.top());

        StackList s2 = new StackList();

        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        s2.display();

    }
}
