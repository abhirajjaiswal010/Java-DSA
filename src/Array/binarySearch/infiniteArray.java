package binarySearch;

public class infiniteArray {

    // Binary Search function
    // Searches for 'target' between indexes 'low' and 'high' in 'arr'
    public static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2; // Find mid to avoid overflow

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in right half
            } else {
                high = mid - 1; // Search in left half
            }
        }
        return -1; // Target not found
    }

    // Function to handle "infinite" sorted array
    // Finds a proper range where target may exist and then calls binarySearch
    static int ans(int[] arr, int target) {
        // Start with initial range [0,1]
        int low = 0;
        int high = 1;

        // Expand the range exponentially until target <= arr[high]
        while (target > arr[high]) {
            int newEnd = high + 1;
            // Double the window size
            high = high + (high - low + 1) * 2;
            low = newEnd;
        }

        // Perform binary search in the found range
        return binarySearch(arr, target, low, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        // Print the index of target in the array
        System.out.println(ans(arr, target));
    }
}
