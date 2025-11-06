import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int s, int e) {
        // Base condition: agar start index end se bada ya equal ho gaya to return kar do
        if (s >= e) return;

        // Pivot ko middle element choose kar rahe hai
        int m = s + (e - s) / 2;
        int p = nums[m];

        // Do pointer use kar rahe hai: low aur high
        int low = s, high = e;

        // Jab tak low pointer high se chhota ya equal hai, partition process chalao
        while (low <= high) {

            // Jab tak left side ke element pivot se chhote hai, low badhao
            while (nums[low] < p) low++;

            // Jab tak right side ke element pivot se bade hai, high ghatao
            while (nums[high] > p) high--;

            // Agar dono pointer valid position par hai to swap karo
            if (low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }

        // Left side ke elements ke liye recursive call
        sort(nums, s, high);

        // Right side ke elements ke liye recursive call
        sort(nums, low, e);
    }

}
