package binarySearch;

public class ceilingOfNum {
    public static int ceiling(int[] arr, int target)
    {
        int low=0,high=arr.length-1;

        if(target>arr[high])
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
        }return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,45,54,65,76};

        System.out.println(ceiling(arr,80));
    }
}
