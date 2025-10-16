package level3;

import java.util.Arrays;

public class bubbleSortByRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]
    }

    // recursive bubble sort
    static void sort(int[] arr, int r, int c) {
        // base case: jab ek hi element bacha ho (r==0)
        if (r == 0)
            return;

        // inner loop (recursion) -> compare adjacent elements
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap kar do agar galat order me hain
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            // next column ke liye call
            sort(arr, r, c + 1);
        }
        // outer loop (recursion) -> ek pass complete ho gaya
        else {
            // ab next row (r-1) ke liye firse start karo
            sort(arr, r - 1, 0);
        }
    }
}
