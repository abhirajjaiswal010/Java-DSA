package binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }


    static public int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        // Step 1: find max element and total sum
        for (int num : arr) {
            start = Math.max(start, num); // largest single element
            end += num;                   // total sum
        }

        // Step 2: Binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Greedy check
            int sum = 0;
            int pieces = 1; // at least one subarray
            for (int num : arr) {
                if (sum + num > mid) {
                    // start new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            // Step 3: adjust binary search
            if (pieces > m) {
                // Too many pieces → need bigger mid
                start = mid + 1;
            } else {
                // Valid or can do better → shrink range
                end = mid;
            }
        }

        return end; // or return start (both same at this point)
    }


}
