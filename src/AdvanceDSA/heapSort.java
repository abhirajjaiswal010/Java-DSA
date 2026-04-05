package AdvanceDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class heapSort {
    static void sort(ArrayList<Integer> arr) {
        int n = arr.size();

        for(int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--) {
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            heapify(arr, i, 0);

        }
    }

    static void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr.get(left) > arr.get(largest))
            largest = left;
        if(right < n && arr.get(right) > arr.get(largest))
            largest = right;
        if(largest != i) {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();

        System.out.print("How many elements you want to insert: ");
        int i = sc.nextInt();


        for (int j = 0; j < i; j++) {
            System.out.print("Enter element " + (j + 1) + ": ");
            int val = sc.nextInt();
          arr.add(val);
        }
        System.out.println("orignal array"+arr);
        sort(arr);
        System.out.println("sorted array: " +arr );
        System.out.print("enter your kth value : ");
        int k = sc.nextInt();
        if (k <= 0 || k > arr.size()) {
            System.out.println("Invalid k value");
        } else {
            int kthLargest = arr.get(arr.size() - k);
            System.out.println(k + "th largest element is: " + kthLargest);
        }



    }
}
