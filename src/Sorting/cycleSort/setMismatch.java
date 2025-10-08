package cycleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr={1,1};
       ;
        System.out.println(Arrays.toString( setMismatchf(arr)));
    }

    static int[] setMismatchf(int[] arr) {
        int i = 0;

        // Cycle sort logic
        while(i < arr.length) {
            int correct = arr[i] - 1; // correct index
            if(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1 ) {
                duplicates.add(arr[j]);
                duplicates.add(j+1);
            }
        }
        // Convert list to array
        int[] result = new int[duplicates.size()];
        for (int k = 0; k < duplicates.size(); k++) {
            result[k] = duplicates.get(k);
        }

        return result;

    }
}
