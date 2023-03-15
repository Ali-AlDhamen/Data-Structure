package Arrays;

public class Task7
{
    // 7. Print SQUARE of the numbers for each array: arr1 and arr2.
    public static void printSquare(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] * arr[i]);
        }
    }

    public static void printSquare(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j] * arr[i][j]);
            }
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Square numbers of arr1 are:");
        printSquare(arr1);
        System.out.println("Square numbers of arr2 are:");
        printSquare(arr2);

    }
}
