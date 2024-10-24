package searching;
public class BinarySearch {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target =5;
        int x = binarySearch(arr,target);
        int low =0;
        int high = arr.length -1;
        int y = binarySearchRecursion(arr,target,low,high);
        System.out.println("The element is found at index "+y);
    }

    public static int binarySearch(int[] arr,int target)
    {
        int low = 0;
        int high = arr.length -1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr,int target,int low,int high)
    {
        if(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
            {
               return mid;
            }
            else if (arr[mid]<target)
            {
                return binarySearchRecursion(arr,target,mid+1,high);
            }
            else
            {
                return binarySearchRecursion(arr,target,low,mid-1);
            }
        }

        return -1;
    }
}
