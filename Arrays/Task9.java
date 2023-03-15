package Arrays;

public class Task9
{
    // 9. Create array (arr5={{1,1,2},{2,5,2}, {4,4,4},{3,0,0}}). Then, find the MULTIPLICATION of arr2 and arr5. Store the result in a new array: arr6.
    public static int[][] multiplyArray(int[][] arr1, int[][] arr2)
    {
        if (arr1[0].length != arr2.length)
        {
            System.out.println("The arrays are not of multipyable");
            return null;
        }

        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2[0].length; j++)
            {
                for (int k = 0; k < arr1[0].length; k++)
                {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int arr2[][] = {{1, 1, 2}, {2, 5, 2}, {4, 4, 4}, {3, 0, 0}};

        int[][] result = multiplyArray(arr1, arr2);
        if (result == null)
        {
            return;
        }
        System.out.println("The result of multiplication is:");
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
