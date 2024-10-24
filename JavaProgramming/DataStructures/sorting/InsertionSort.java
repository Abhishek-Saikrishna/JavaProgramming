package sorting;

public class InsertionSort {
    public static void main(String args[])
    {
        int arr[] = {5,4,6,3,7,8,1};
        for(int i :insertionSort(arr))
        {
            System.out.print(i +" ");
        }
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i =1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while ((j>=0 )&& arr[j]>key)
            {
             arr[j+1] = arr[j];
             j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
