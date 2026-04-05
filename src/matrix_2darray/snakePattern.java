package matrix_2darray;

public class snakePattern {
    public static void main(String[] args) {
        int[][] mat = {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12}
        };
        int n = mat.length;
        for(int i = 0; i <n ; i++) {

                if (i % 2 == 0) { // left → right
                    for (int j = 0; j < mat[i].length; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
                else { // right → left
                    for (int j = mat[i].length - 1; j >= 0; j--) {
                        System.out.print(mat[i][j] + " ");
                    }
                }

                System.out.println();

        }
    }
}
