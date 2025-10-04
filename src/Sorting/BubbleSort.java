public class BubbleSort {

    public static void main(String[] args) {
        // Array ko define kar rahe hain
        int[] arr = {3, 2, 5, 4};

        // Bubble Sort function call karke array ko sort karenge
        sort(arr);

        // Sorted array print karenge
        System.out.print("Sorted Array =>");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int n = arr.length; // Array ki length

        boolean swapped; // Flag to check agar swap hua ya nahi

        // Outer loop => Passes ke liye, n-1 passes chahiye
        for(int i = 0; i < n - 1; i++) {
            swapped = false; // Har pass ke start me swapped ko false set karo

            // Inner loop => Adjacent elements ko compare karenge
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) { // Agar current element next se bada hai
                    // Swap kar do
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Swap hua hai, flag ko true set karo
                }
            }

            // Agar is pass me koi swap nahi hua, to array already sorted hai
            if(!swapped) break;
        }
    }
}
