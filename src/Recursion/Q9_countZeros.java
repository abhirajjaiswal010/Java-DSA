public class Q9_countZeros {

    public static void main(String[] args) {
        count(203000);
        System.out.println(zeros);

    }

    static int zeros = 0;

    static void count(int n) {
        if(n == 0)
            return;

        int rem = n % 10;
        if(rem == 0) {
            zeros++;
        }

        count(n / 10);
    }

}
