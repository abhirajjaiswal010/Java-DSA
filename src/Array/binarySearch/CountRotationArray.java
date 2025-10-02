package binarySearch;

public class CountRotationArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // Expected output = 4 (since rotated 4 times)
        System.out.println(countRotations(arr));
    }

    /**
     * Function to return how many times the sorted array is rotated.
     * Formula: rotationCount = (pivotIndex + 1) % n
     */
    private static int countRotations(int[] arr) {
        int pivot = FindPivotWithDuplicates(arr);
        // pivot gives index of largest element → rotations = pivot + 1
        return (pivot + 1) % arr.length;
    }

    /**
     * Function to find the pivot (largest element index) in a rotated sorted array.
     * Pivot is the point where rotation happened.
     * Handles duplicates also.
     *
     * Example: [4,5,6,7,0,1,2]
     * Pivot = index 3 (element = 7)
     */
    static int FindPivotWithDuplicates(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Case 1: If mid element > next element → mid is pivot
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: If mid element < previous element → previous element is pivot
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: If arr[low], arr[mid], arr[high] are equal → skip duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                // Check if low is pivot
                if (low < high && arr[low] > arr[low + 1]) {
                    return low;
                }
                low++;

                // Check if high is pivot
                if (high > low && arr[high] < arr[high - 1]) {
                    return high - 1;
                }
                high--;
            }

            // Case 4: Left part is sorted → pivot is in right half
            else if (arr[low] < arr[mid] || (arr[low] == arr[mid] && arr[mid] > arr[high])) {
                low = mid + 1;
            }
            // Case 5: Pivot lies in left half
            else {
                high = mid - 1;
            }
        }

        // If no pivot found → array not rotated
        return -1;
    }
}
