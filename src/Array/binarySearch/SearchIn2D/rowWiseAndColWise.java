package binarySearch.SearchIn2D;

import java.util.Arrays;

public class rowWiseAndColWise {
    public static void main(String[] args) {
        int[][] arr = {
               {1, 4, 7, 11},
               {2, 5, 8, 12},
               {3, 6, 9, 16},
               {10, 13, 14, 17}
        };

        // Trying to search element in the matrix
        // For example target = 74 (not present)
        System.out.println(Arrays.toString(search(arr, 74)));
    }

    static int[] search(int[][] matrix, int target) {
        // Start from top-right corner
        int r = 0;                    // row index
        int c = matrix.length - 1;    // last column index

        // Traverse while row and column are within bounds
        while(r < matrix.length && c >= 0) {
            // If element found → return its coordinates
            if(matrix[r][c] == target) {
                return new int[]{r, c};
            }

            // If current element is smaller than target → move down
            if(matrix[r][c] < target) {
                r++;
            }
            // Else if current element is greater than target → move left
            else {
                c--;
            }
        }

        // If not found → return -1, -1
        return new int[]{-1, -1};
    }
}
