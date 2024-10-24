package searching;
public class LinearSearch {

    public static void main(String args[])
    {
        int arr[] = {1,3,5,7,9,10};
        int target = 10;
        int x = linearSearch(arr,target);
        System.out.println("Element found at index "+x);
    }

    private static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
