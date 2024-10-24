package sorting;

public class BubbleSorting {
    public static void main(String args[])
    {
        int arr[] = {4,5,3,7,5,1,9};
        for(int i :bubbleSort(arr))
        {
            System.out.print(i+" ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length-1;j++ )
            {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        return arr;
    }
}
