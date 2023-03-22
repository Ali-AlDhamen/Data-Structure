package Arrays;

public class Lab
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

    public static void printEven(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }

    public static void printEven(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] % 2 == 0)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printSquare(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] * arr[i] + " ");
        }
        System.out.println();
    }

    public static void printSquare(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] * arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static int[] addArrays(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            System.out.println("Arrays length not same");
            return null;
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void printArray(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[][] = {{-1, -2, -3, -4}, {5, 6, -7, 8}, {7, 10, 11, -12}};
        int arr3[] = {10, 10, 20, 5, 100, 2};
        int[] arr4 = addArrays(arr1, arr3);
        int arr5[][] = {{1, 1, 2}, {2, 5, 2}, {4, 4, 4}, {3, 0, 0}};

        System.out.println("Max of arr1 is " + findMax(arr1));
        System.out.println("Max of arr2 is " + findMax(arr2));

        System.out.println("Average of arr1 is " + findAverage(arr1));
        System.out.println("Average of arr2 is " + findAverage(arr2));

        System.out.println("Even numbers of arr1 are:");
        printEven(arr1);
        System.out.println("Even numbers of arr2 are:");
        printEven(arr2);

        System.out.println("Square numbers of arr1 are:");
        printSquare(arr1);
        System.out.println("Square numbers of arr2 are:");
        printSquare(arr2);

        if (arr4 == null)
        {
            return;
        }
        else
        {
            System.out.println("Addition of arr1 and arr3 is:");
            printArray(arr4);
        }

    }
}
