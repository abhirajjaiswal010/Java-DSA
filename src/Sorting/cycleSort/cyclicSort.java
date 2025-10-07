package cycleSort;

import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {
        // Example array: elements 1 se N tak unordered
        int[] arr = {3, 5, 2, 1, 4};


        // Cyclic sort function call
        sort(arr);

        // Sorted array print karo
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;

        // Loop tab tak chalao jab tak har element apni correct jagah par na aa jaye
        while (i < arr.length) {
            int correct = arr[i] - 1; // current element ka correct index

            // Agar element apni jagah par nahi hai, swap karo
            if (arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;


            }
            else {
                // Agar element sahi jagah par hai, next element par move karo
                i++;
            }
        }
    }
}
