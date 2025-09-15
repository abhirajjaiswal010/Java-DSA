public class richestwealthfirst {

    static void wealth(int[][] num) {
        int maxWealth = 0;

        for (int i = 0; i < num.length; i++) {
            int currentWealth = 0;

            for (int j = 0; j < num[i].length; j++) {
                currentWealth += num[i][j];  // sum of one person's wealth
            }

            if (maxWealth < currentWealth) {
                maxWealth = currentWealth;
            }
        }

        System.out.println(maxWealth);
    }

    public static void main(String[] args) {
        int[][] arr = {
               {1, 5},
               {7, 3},
               {3, 5}
        };

        wealth(arr);
    }
}
