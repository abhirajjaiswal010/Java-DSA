public class Q7_reverseNo {
    public static void main(String[] args) {
        // Method 1: Using global variable 'sum'
        rev1(1452);
        System.out.println(sum); // Prints reversed number from rev1

        // Method 2: Using recursion with helper function
        System.out.println(rev2(1452)); // Prints reversed number from rev2
    }

    // ------------------ Method 1 ------------------
    static int sum = 0; // Global variable to store reversed number

    static void rev1(int n) {
        if(n == 0) {
            return; // Base case: agar number 0 ho gaya toh return
        }
        int rem = n % 10; // Last digit nikal rahe
        sum = sum * 10 + rem; // Last digit ko sum ke aage add kar rahe
        rev1(n / 10); // Remaining number ke liye recursion
    }

    // ------------------ Method 2 ------------------
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
}
