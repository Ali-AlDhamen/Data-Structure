package Arrays;

public class Task5
{
    public static void printEven(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
            }
        }

    }

    public static void printEven(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] % 2 == 0)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Even numbers of arr1 are:");
        printEven(arr1);
        System.out.println("Even numbers of arr2 are:");
        printEven(arr2);
    }

}
