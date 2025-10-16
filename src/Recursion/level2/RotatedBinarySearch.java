package level2;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        System.out.println(search(arr, 0, arr.length - 1, 3)); // target = 3
    }

    static boolean search(int[] arr, int start, int end, int key) {

        // mid index nikal rahe hain
        int mid = start + (end - start) / 2;

        // base condition: agar start bada ho gaya end se -> element nahi mila
        if (start > end) {
            return false;
        }

        // agar mid element hi key ke barabar hai -> mil gaya
        if (key == arr[mid]) {
            return true;
        }

        // check karo left half sorted hai kya
        if (arr[start] <= arr[mid]) {

            // agar key left sorted part me lie karti hai
            if (key >= arr[start] && key <= arr[mid]) {
                return search(arr, start, mid - 1, key); // left side me search karo
            } else {
                return search(arr, mid + 1, end, key);   // otherwise right side me jao
            }
        }
        // warna right half sorted hoga
        else {
            // agar key right sorted part me lie karti hai
            if (key > arr[mid] && key <= arr[end]) {
                return search(arr, mid + 1, end, key);   // right side me search karo
            } else {
                return search(arr, start, mid - 1, key); // otherwise left side me jao
            }
        }
    }
}
