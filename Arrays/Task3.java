package Arrays;

public class Task3
{
    public static double findAverage(int[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double findAverage(int[][] arr)
    {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
                count++;
            }
        }
        return sum / count;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Average of arr1 is " + findAverage(arr1));
        System.out.println("Average of arr2 is " + findAverage(arr2));

    }
}
