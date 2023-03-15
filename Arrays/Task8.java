package Arrays;

public class Task8
{
    public static int[] addArrays(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr3[] = {10, 10, 20, 5, 100, 2};

        int[] arr4 = addArrays(arr1, arr3);
        System.out.println("Addition of arr1 and arr3 is:");
        for (int i = 0; i < arr4.length; i++)
        {
            System.out.print(arr4[i] + " ");
        }
    }
}
