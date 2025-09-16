package binarySearch;

public class flooringOfNum {
    public static int flooring(int[] arr, int target)
    {
        int low=0,high=arr.length-1;

        if(target<arr[low])
        {
            return -1;
        }
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(target == arr[mid])
            {
                return arr[mid];
            }
            else if (target>arr[mid])
            {
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }return arr[high];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,45,54,65,76};

        System.out.println(flooring(arr,43));
    }
}
