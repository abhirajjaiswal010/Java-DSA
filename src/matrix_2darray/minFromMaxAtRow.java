package matrix_2darray;

import java.util.Arrays;

public class minFromMaxAtRow {

    public static void main(String[] args) {
        int [][] mat ={
               {4, 7, 2},
               {9, 1, 5},
               {6, 3, 8}
        };
        int n= mat.length;

        int answer=Integer.MAX_VALUE;

        for(int i = 0; i <n ; i++) {
         int  max=mat[i][0];

            for(int j = 0; j <n ; j++) {
               max=Math.max(max,mat[i][j]);
            }
           answer=Math.min(answer,max);
        }
        System.out.println(answer);

    }
}
