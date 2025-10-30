import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = sort(arr); // function call for sorting
        System.out.println(Arrays.toString(arr)); // sorted array print kar diya
    }

    // ye function recursive tarike se array ko divide karega aur merge karke sorted array return karega
    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            // agar sirf ek element bacha hai to wahi return kar do (base case)
            return arr;
        }

        int mid = arr.length / 2; // middle index nikal lo

        // left aur right part alag kar diye
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // dono sorted parts ko merge karo
        return merge(left, right);
    }

    // ye function dono sorted arrays ko mila ke ek final sorted array banata hai
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; // final merged array
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for merged array

        // dono arrays ke elements compare kar ke chhota element pehle daal rahe hain
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // agar first array me abhi bhi element bache hain to unhe daal do
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // agar second array me abhi bhi element bache hain to unhe daal do
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix; // final sorted array return kar diya
    }
}
