public class countEvenNumInArray {

    static int countnum(int[] arr) {
        int count1 = 0; // counter for numbers with even digits

        for (int num : arr) {
            int count = 0; // counter for digits of current number

            // loop to count digits of current number
            while (num > 0) {
                int digit = num % 10; // extract last digit (not actually needed)
                count++;              // increase digit counter
                num /= 10;            // remove last digit (this was wrong in your earlier code)
            }

            // check if digit count is even
            if (count % 2 == 0) {
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        int[] arr = {555, 901, 482, 1771};
        System.out.println(countnum(arr)); // Output: 1
    }
}
