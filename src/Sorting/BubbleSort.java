public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4};
        search(arr);
        System.out.print("Sorted Array =>");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void search(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n - 1; i++) {
            swapped = false;

            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; // Already sorted
        }
    }


}
