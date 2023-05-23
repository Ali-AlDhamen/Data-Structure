package Stack;

public class Main
{

    public static boolean checkBrackets(String str)
    {
        StackList<Character> stack = new StackList<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(')
                {
                    return false;
                }
                if (ch == '}' && top != '{')
                {
                    return false;
                }
                if (ch == ']' && top != '[')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static String decimalToBinary(int num)
    {
        StackList<Integer> stack = new StackList<>();
        while (num > 0)
        {
            stack.push(num % 2);
            num /= 2;
        }
        String binary = "";
        while (!stack.isEmpty())
        {
            binary += stack.pop();
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
        System.out.println(s1.top());
        s1.push(4);
        System.out.println(s1.top());
        s1.push(5);
        System.out.println(s1.top());

        StackList<Integer> s2 = new StackList<>();

        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        s2.display();


        System.out.println(decimalToBinary(10));
        System.out.println(decimalToBinary(15));

        System.out.println(checkBrackets("()"));
        System.out.println(checkBrackets("(){}[]"));

    }
}
