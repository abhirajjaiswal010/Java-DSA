package binarySearch.SearchIn2D;

public class SortedMatrices {
    public static void main(String[] args) {
        int[][] matrix = {
               {1, 3, 5, 7},
               {10, 11, 16, 20},
               {23, 30, 34, 50}
        };

        int target = 3;
        int[] ans = search(matrix, target);
        System.out.println(ans[0] + "," + ans[1]); // prints row,col
    }

    // Binary search in a single row
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) return new int[]{row, mid};
            else if (matrix[row][mid] < target) cStart = mid + 1;
            else cEnd = mid - 1;
        }
        return new int[]{-1, -1};
    }

    // Search in sorted matrix
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Only 1 row → simple binary search
        if (rows == 1) return binarySearch(matrix, 0, 0, cols - 1, target);

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Run until 2 rows remain
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) return new int[]{mid, cMid};
            if (matrix[mid][cMid] < target) rStart = mid;
            else rEnd = mid;
        }

        // Now we have 2 rows: rStart and rStart+1 (rEnd)
        // Check middle column
        if (matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        if (matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        // Search 4 halves
        // 1st half
        if (target <= matrix[rStart][cMid - 1])
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        // 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1])
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        // 3rd half
        if (target <= matrix[rStart + 1][cMid - 1])
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
            // 4th half
        else
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
}
