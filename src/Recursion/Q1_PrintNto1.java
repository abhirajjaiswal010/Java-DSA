public class Q1_PrintNto1 {
    public static void main(String[] args) {
printNto1(5);
    }

    static void printNto1(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }

}
