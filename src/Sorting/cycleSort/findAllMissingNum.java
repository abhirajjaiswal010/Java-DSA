package cycleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class findAllMissingNum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(sort(arr));
    }

    static ArrayList<Integer> sort(int[] arr) {
        int i = 0;

        // Cycle sort logic
        while (i < arr.length) {
            int correct = arr[i] - 1; // correct index
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Store all missing numbers dynamically
        ArrayList<Integer> missing = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missing.add(j + 1);
            }
        }

        return missing;
    }
}
