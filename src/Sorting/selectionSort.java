public class selectionSort {
    public static void main(String[] args) {
        // Array ko define kar rahe hain
        int[] arr = {3, 2, 5, 4, 1};

        // Selection Sort function call karke array ko sort karenge
        sort(arr);

        // Sorted array print karenge
        System.out.print("Sorted Array => ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int n = arr.length; // Array ki length store kar li

        // Outer loop -> har position ke liye
        for(int i = 0; i <= n - 1; i++) {
            int min = i; // Assume karte hain ki current element hi minimum hai

            // Inner loop -> unsorted part me minimum element dhundho
            for(int j = i + 1; j < n; j++) {
                if(arr[min] > arr[j]) {
                    // Agar unsorted element chhota hai to min update karo
                    min = j;
                }

                // Swap galat jagah pe ho raha hai
                // Ye swap inner loop me nahi hona chahiye
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
