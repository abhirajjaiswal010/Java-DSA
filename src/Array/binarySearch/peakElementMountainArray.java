package binarySearch;

public class peakElementMountainArray {

    // Function to find the peak element index in a mountain array
    public static int binarySearch(int[] arr) {
        int low = 0;                 // start pointer
        int high = arr.length - 1;   // end pointer

        // Loop until low and high meet
        while (low < high) {
            // find mid (avoid overflow with formula)
            int mid = low + (high - low) / 2;

            // check if we are in increasing slope of mountain
            if (arr[mid] < arr[mid + 1]) {
                // move right, because peak is on the right side
                low = mid + 1;
            } else {
                // move left (including mid), because peak could be mid or left side
                high = mid;
            }
        }

        // at the end, low == high → peak index
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1};   // example mountain array
        System.out.println(binarySearch(arr));  // prints peak index (here, 1)
    }
}
