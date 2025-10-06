import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        // Outer loop — har element ke liye (starting from 0 to last-1)
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop — current element ko uske sahi position tak shift karte hue le jao
            for (int j = i + 1; j > 0; j--) {

                // Agar current element apne previous se chhota hai to swap karo
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                // Agar current element sahi jagah par hai, to loop se bahar aa jao
                else {
                    break;
                }
            }
        }
    }
}
