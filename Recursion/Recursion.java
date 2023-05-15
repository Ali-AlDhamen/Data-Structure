package Recursion;

class Recursion
{

    public static int sumDigits(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            return n % 10 + sumDigits(n / 10);
        }
    }

    static public int ackermann(int m, int n)
    {
        if (m == 0)
        {
            return n + 1;
        }
        else if (n == 0)
        {
            return ackermann(m - 1, 1);
        }
        else
        {
            return ackermann(m - 1, ackermann(m, n - 1));
        }

    }

    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else if (a == 0)
        {
            return a;
        }
        else if (a < b)
        {
            System.out.println(b % a);
            return gcd(a, b % a);
        }
        else
        {
            return gcd(a % b, b);
        }
    }

    public static void main(String[] args)
    {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(111111));

    }
}