package cycleSort;

import java.util.Arrays;

public class missingNo {
    public static void main(String[] args) {
        // Example array: elements 0 se n ke beech, ek missing
        int[] arr = {3, 0, 1};

        // Call function to find missing number
        System.out.println("Missing Number: " + sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;

        // Loop tab tak chalao jab tak har element apni correct jagah par na aa jaye
        while (i < arr.length) {

            // ⚠️ Edge Case: element >= arr.length nahi hai
            // sirf 0 to n-1 ke elements ke liye swap karo
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {

                int correct = arr[i]; // current element ka correct index
                // Swap element ko uski correct jagah par le jao
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;

                // Debug print (optional)
                System.out.println("Swapped: " + Arrays.toString(arr));

            } else {
                // Agar element sahi jagah par hai ya element = arr.length
                // to next element par move karo
                i++;
            }
        }

        // Loop karke missing number find karo
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j; // jo index aur value match nahi karte → missing number
            }
        }

        // Agar sab elements sahi jagah par hain → missing number last me hai
        return arr.length;
    }
}
