
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int count = 0;
        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++){

                arr[i][j]=count++;
            }
        }

//        System.out.println(Arrays.deepToString(arr));
        for(int i=0 ; i<arr.length;i++) {
            for(int j=0; j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}