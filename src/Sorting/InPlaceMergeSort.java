import java.util.Arrays;

public class InPlaceMergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length); // sort the entire array
        System.out.println(Arrays.toString(arr)); // print sorted array
    }

    // Recursive function to divide and merge array
    static void sort(int[] arr, int s, int e) {
        // base case: if only one element, nothing to sort
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2; // find mid index

        // recursively sort left and right halves
        sort(arr, s, mid);
        sort(arr, mid, e);

        // merge both sorted halves
        merge(arr, s, mid, e);
    }

    // merge two sorted parts of the array in place
    private static void merge(int[] arr, int s, int m, int e) {
        // create a temporary array to store merged result
        int[] mix = new int[e - s];

        int i = s; // pointer for left half
        int j = m; // pointer for right half
        int k = 0; // pointer for merged array

        // merge elements from both halves in sorted order
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements from left half (if any)
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // copy remaining elements from right half (if any)
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // copy merged array back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
