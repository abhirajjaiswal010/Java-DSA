package binarySearch;

public class findInMountainArray {

    // Main search method for target in mountain array
    int search(int[] arr, int target) {
        // Step 1: Find peak index
        int peak = peakIndexInMountainInArray(arr);

        // Step 2: Search in ascending part (0 → peak)
        int firstTry = orderAgnosticBs(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // Step 3: Otherwise search in descending part (peak+1 → end)
        return orderAgnosticBs(arr, target, peak + 1, arr.length - 1);
    }

    // Order-agnostic binary search (works on ascending/descending)
    public static int orderAgnosticBs(int[] arr, int target, int low, int high) {
        // check order
        boolean isAsc = arr[low] < arr[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // found
            }

            if (isAsc) { // ascending part
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // descending part
                if (target > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1; // not found
    }

    // Find peak index in mountain array
    public static int peakIndexInMountainInArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // go right
            } else {
                high = mid;    // go left (including mid)
            }
        }
        return low; // peak index
    }

    // For testing
    public static void main(String[] args) {
        findInMountainArray obj = new findInMountainArray();

        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        System.out.println(obj.search(arr, 5)); // should print 2
        System.out.println(obj.search(arr, 6)); // should print 4
        System.out.println(obj.search(arr, 10)); // should print -1
    }
}
