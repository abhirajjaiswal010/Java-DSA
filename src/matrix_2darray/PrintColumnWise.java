package matrix_2darray;

public class PrintColumnWise {
    public static void main(String[] args) {
        int [][] mat ={
               {4, 7, 2},
               {9, 1, 5},
               {6, 3, 8}
        };
        int n=mat.length;


        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <n; j++) {
                System.out.print(mat[j][i]);
            }
            System.out.println();
           }
        }

    }

