package matrix_2darray;

public class rowWithMaxSum {
    public static void main(String[] args) {
        int sum =0;

        int[][] matrix = {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12}
        };
        for(int i = 0; i <3 ; i++) {
            int sum2=0;
            for(int j = 0; j <4 ; j++) {
                sum2+=matrix[i][j];
            }
            sum=Math.max(sum2,sum);

        }
        System.out.println(sum);

    }


}
