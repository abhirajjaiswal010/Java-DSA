package level1;

public class Q5_sumOfdigit {
    public static void main(String[] args) {
        System.out.println( sumDigit(1342));
    };

    static int sumDigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
int lDigit=n%10;
        return lDigit+sumDigit(n/10);
    }
}
