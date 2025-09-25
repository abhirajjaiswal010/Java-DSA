package binarySearch;


public class firstLastOccurence {
    public static int[] occur(int[] arr, int target) {

        int[] ans = {-1, -1};
       int low=search(arr,target,true);
       int high=search(arr,target,false);
       ans[0]=low;
       ans[1]=high;
       return ans;
    }

   static int search(int[] arr, int target,boolean findStartIndex){
        int ans=-1;
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target < arr[mid]) {
                high = mid - 1;
            } else if(target > arr[mid]) {
                 low=mid + 1;
            } else {
                ans=mid;
                if(findStartIndex==true){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        int[] result = occur(arr, 5);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}
