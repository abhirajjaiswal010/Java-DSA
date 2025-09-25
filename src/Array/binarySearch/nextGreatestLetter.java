package binarySearch;

public class nextGreatestLetter {
    public static char Letter(char[] arr, char target) {
        int low = 0, high = arr.length - 1; while(low <= high) {
            int mid = low + (high - low) / 2;

            if(target < arr[mid]) {
                high = mid - 1;  // look left
            } else {
                low = mid + 1;   // look right
            }
        }

        return arr[low % arr.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(Letter(arr, 'a'));
        System.out.println(Letter(arr, 'c'));
        System.out.println(Letter(arr, 'j'));

    }
}
