package level1;

public class Q6_productOfDigit {
    public static void main(String[] args) {
        System.out.println( productDigit(1342));
    };

    static int productDigit(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int lDigit=n%10;
        return lDigit*productDigit(n/10);
    }


}
