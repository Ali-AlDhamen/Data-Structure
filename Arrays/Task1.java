package Arrays;

class Task1
{

    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMax(int[][] arr)
    {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Max of arr1 is " + findMax(arr1));
        System.out.println("Max of arr2 is " + findMax(arr2));

    }
}