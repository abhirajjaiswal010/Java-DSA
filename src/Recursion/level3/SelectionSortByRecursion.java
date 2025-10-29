package level3;

import java.util.Arrays;

public class SelectionSortByRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]
    }

    static void sort(int[] arr, int r, int c, int max) {
        // Base case: jab saare elements sort ho jaaye (r == 0)
        if (r == 0)
            return;

        // Inner loop (recursion se) — har element ko compare karte hain max find karne ke liye
        if (c < r) {
            if (arr[c] > arr[max]) {
                // agar current element max se bada hai, to max update kar do
                sort(arr, r, c + 1, c);
            } else {
                // warna next element check karte jao
                sort(arr, r, c + 1, max);
            }
        }
        // Outer loop (recursion se) — ek pass complete hone ke baad
        else {
            // max element ko last me bhej do (swap)
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // ab next pass ke liye recursion call (r-1 because last element fix ho gaya)
            sort(arr, r - 1, 0, 0);
        }
    }
}
