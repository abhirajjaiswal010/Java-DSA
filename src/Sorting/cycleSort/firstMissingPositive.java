package cycleSort;

import java.util.Arrays;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(result(arr));  // print the missing number
    }

    static int result(int[] arr) {
        int i = 0;

        // Step 1: Place every number in its correct index
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find the first index where index+1 != arr[index]
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;  // missing positive number
            }
        }

        // Step 3: If all are in place, missing number is n+1
        return arr.length + 1;
    }
}
