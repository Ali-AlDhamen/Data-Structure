package Arrays;

class Task2
{

    public static int findMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMin(int[][] arr)
    {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Min of arr1 is " + findMin(arr1));
        System.out.println("Min of arr2 is " + findMin(arr2));

    }
}