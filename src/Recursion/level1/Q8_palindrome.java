package level1;

public class Q8_palindrome {


    public static void main(String[] args) {


        System.out.println(palin(1230321));

    }

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1; // Number of digits nikal rahe
        return helper(n, digits); // Helper function call
    }

    private static int helper(int n, int digits){
        if(n % 10 == 1){
            return n; // Base case: agar last digit 1 ho toh return n
        }
        int rem = n % 10; // Last digit nikal rahe
        // Last digit ko correct position me multiply karke add kar rahe
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n ){
        return n == rev2(n);
    }


}
