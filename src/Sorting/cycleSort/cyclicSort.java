package cycleSort;

import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {
        // Example array: elements 1 se N tak unordered
        int[] arr = {3, 5, 2, 1, 4};

        // ⚠️ Warning:
        // Cyclic Sort sirf 1 se N ke numbers ke liye kaam karta hai
        // Agar numbers missing hain, duplicate hain, zero ya negative hain → wrong result milega
        System.out.println("⚠️ Warning: Array should contain 1 to N, no duplicates, no negatives/zeros.");

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

                // Debug print: kaun swap hua aur array ka current state
                System.out.println("Swapped " + arr[correct] + " and " + arr[i] + " → " + Arrays.toString(arr));
            }
            else {
                // Agar element sahi jagah par hai, next element par move karo
                i++;
            }
        }
    }
}
