package Arrays;

public class Task6
{
    public static void printOdd(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }

    public static void printOdd(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] % 2 != 0)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Odd numbers of arr1 are:");
        printOdd(arr1);
        System.out.println("Odd numbers of arr2 are:");
        printOdd(arr2);
    }

}
