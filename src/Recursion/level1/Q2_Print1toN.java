package level1;

public class Q2_Print1toN {
    public static void main(String[] args) {
        printNto1(5);
    }

    static void printNto1(int n) {
        if(n == 0) {
            return;
        }
        printNto1(n - 1);
        System.out.print(n + " ");
    }

}
