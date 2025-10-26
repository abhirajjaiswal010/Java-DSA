import java.util.Scanner;

public class deletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete (1 to " + n + "): ");
        int pos = sc.nextInt();

        if(pos < 1 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            for(int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // reduce size

            System.out.println("Array after deletion:");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
