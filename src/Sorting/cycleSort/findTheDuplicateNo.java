package cycleSort;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class findTheDuplicateNo {


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3, 4};

        System.out.println(duplicate(arr));

    }


    static ArrayList<Integer> duplicate(int[] arr) {
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
            if(arr[j] != j + 1) {
                duplicates.add(arr[j]);
            }
        }
        return duplicates;
    }
}
