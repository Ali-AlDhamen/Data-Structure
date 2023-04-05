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
    public static void main(String[] args)
    {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(111111));

    }
}