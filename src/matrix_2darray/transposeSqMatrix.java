package matrix_2darray;

public class transposeSqMatrix {
    public static void main(String[] args) {
        int[][] mat = {{4, 7, 2}, {9, 1, 5}, {6, 3, 8 }}; print(mat); int n = mat.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = mat[i][j]; mat[i][j] = mat[j][i]; mat[j][i] = temp;
            }

        } System.out.println("============================"); print(mat);
    }

    public static void print(int[][] mat) {
        for(int[] row : mat) {
            for(int val : row) {
                System.out.print(val + " ");
            } System.out.println();
        }

    }
}
