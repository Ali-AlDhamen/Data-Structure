package Stack;

public class Main
{

    public static String isbalanced(String expression){
        StackArray s1 = new StackArray(expression.length());

        for (int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
            {
                s1.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (s1.isEmpty())
                {
                    return "Not Balanced";
                }
                else if (ch == ')' && s1.top() == '(')
                {
                    s1.pop();
                }
                else if (ch == '}' && s1.top() == '{')
                {
                    s1.pop();
                }
                else if (ch == ']' && s1.top() == '[')
                {
                    s1.pop();
                }
                else
                {
                    return "Not Balanced";
                }
            }
        }

        if (s1.isEmpty())
        {
            return "Balanced";
        }
        else
        {
            return "Not Balanced";
        }
    }

    public static String ConvertingDecimalToBinary(int num){
        StackArray s1 = new StackArray(10);
        String binary = "";

        while (num != 0)
        {
            int rem = num % 2; // 19%2 = 1 , 9%2 = 1 , 4%2 = 0 , 2%2 = 0 , 1%2 = 1
            s1.push(rem); // 1 1 0 0 1
            num = num / 2; // 9 , 4 , 2 , 1
        }

        while (!s1.isEmpty())
        {
            binary += s1.pop();
        }

        return binary;
    }


    public static void main(String[] args)
    {

        StackArray s1 = new StackArray(5);
        s1.push(1);
        System.out.println(s1.top());
        s1.push(2);
        System.out.println(s1.top());
        s1.push(3);
        System.out.println(s1.size());
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
        System.out.println(isbalanced("([{a-s}]+{ab+v})"));
        System.out.println(ConvertingDecimalToBinary(19));


    }
}
