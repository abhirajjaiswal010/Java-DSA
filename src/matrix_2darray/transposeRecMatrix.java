package matrix_2darray;

public class transposeRecMatrix {
    public static void main(String[] args) {
        int[][] mat = {{4, 7, 2, 4}, {9, 1, 5, 5}, {6, 3, 8, 4}}; print(mat);
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transpose[j][i] = mat[i][j];

            }

        }
        System.out.println("------------------");
        print(transpose);
    }

    public static void print(int[][] mat) {
        for(int[] row : mat) {
            for(int val : row) {
                System.out.print(val + " ");
            } System.out.println();
        }

    }
}
