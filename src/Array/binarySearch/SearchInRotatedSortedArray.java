package binarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // Example rotated sorted array
        int[] arr = {4, 5, 6, 7, 0, 1};

        // Search for element '1'
        System.out.println(BinarySearch(arr, 1)); // Expected output: 5
    }

    /**
     * Main function to search target in rotated sorted array.
     * Steps:
     * 1. Find pivot (index of largest element).
     * 2. Decide which part (left or right) to apply binary search.
     */
    static int BinarySearch(int[] arr, int target) {
        int pivot = FindPivot(arr);

        // Case 1: Array is not rotated → normal binary search
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // Case 2: Target is the pivot element
        if (arr[pivot] == target) {
            return pivot;
        }

        // Case 3: Target lies in left half (from index 0 to pivot-1)
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        // Case 4: Target lies in right half (from pivot+1 to end)
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    /**
     * Standard binary search implementation.
     * Searches for target between indices [low, high].
     */
    public static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid overflow

            // If element found at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    /**
     * Function to find pivot in rotated sorted array.
     * Pivot = index of largest element (the "rotation point").
     *
     * Example:
     * arr = [4, 5, 6, 7, 0, 1]
     * pivot = 3 (element = 7)
     */
    static int FindPivot(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Case 1: mid > mid+1 → mid is pivot
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid < mid-1 → mid-1 is pivot
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: If left side is unsorted → pivot lies in left half
            if (arr[mid] <= arr[low]) {
                high = mid - 1;
            }
            // Case 4: Otherwise pivot lies in right half
            else {
                low = mid + 1;
            }
        }

        // No pivot found → array is not rotated
        return -1;
    }
}
