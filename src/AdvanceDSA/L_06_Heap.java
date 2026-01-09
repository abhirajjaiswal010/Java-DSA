package AdvanceDSA;

import java.util.ArrayList;
import java.util.Scanner;

class minHeap {
    ArrayList<Integer> heap;

    minHeap() {
        heap = new ArrayList<>();
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }


    int getMin() {
        return heap.get(0);

    }

    void insert(int k) {
        heap.add(k);
        int i = heap.size() - 1;

        //heapify up

        while(i > 0 && heap.get(parent(i)) > heap.get(i)) {
            int p = parent(i);
            swap(i, p);
            i = p;
        }
    }

    void decreaseKey(int i, int new_val) {
        heap.set(i, new_val);
        while(i != 0 && heap.get(parent(i)) > heap.get(i)) {
            int p = parent(i);
            swap(i, p);
            i = p;
        }
    }

    int extractMin() {
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int root = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        minHeapify(0);
        return root;
    }

    void deleteKey(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    void minHeapify(int i) {
        int n = heap.size();
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if(l < n && heap.get(l) < heap.get(smallest))
            smallest = l;
        if(r < n && heap.get(r) < heap.get(smallest))
            smallest = r;

        if(smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }

    }

    void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    void printHeap() {
        System.out.println(heap);
    }

}


public class L_06_Heap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        minHeap h = new minHeap();
        System.out.print("How many elements you want to insert: ");
        int i = sc.nextInt();


        for (int j = 0; j < i; j++) {
            System.out.print("Enter element " + (j + 1) + ": ");
            int val = sc.nextInt();
            h.insert(val);
        }

        System.out.println("Min heap");
        h.printHeap();
        h.deleteKey(3);
        System.out.println("After deleting the element from given index");
        h.printHeap();

    }
}
