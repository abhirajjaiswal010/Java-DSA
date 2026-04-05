package matrix_2darray;

public class snakePatternColWise {
    public static void main(String[] args) {
        int[][] mat = {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12}
        };
        int n = mat.length;
        for(int i = 0; i <mat[0].length ; i++) {

            if (i % 2 == 0) { // left → right
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            }
            else { // right → left
                for (int j = mat.length - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }

            System.out.println();

        }
    }
}
