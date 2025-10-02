package binarySearch;

public class SearchInRotatedSortedArrayDuplicate {
    public static void main(String[] args) {
        // Example rotated sorted array with duplicates
        int[] arr = {4, 5, 6, 7, 0, 1, 1, 2, 4, 4};

        // Search for element '1'
        System.out.println(BinarySearch(arr, 1)); // Expected output: index of '1'
    }

    static int BinarySearch(int[] arr, int target) {
        int pivot = FindPivotWithDuplicates(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int FindPivotWithDuplicates(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Case 1: pivot found
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 2: If values are same at low, mid, high → skip duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                if (low < high && arr[low] > arr[low + 1]) {
                    return low;
                }
                low++;

                if (high > low && arr[high] < arr[high - 1]) {
                    return high - 1;
                }
                high--;
            }
            // Case 3: Left side is sorted, so pivot in right side
            else if (arr[low] < arr[mid] || (arr[low] == arr[mid] && arr[mid] > arr[high])) {
                low = mid + 1;
            }
            // Case 4: Pivot in left side
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
