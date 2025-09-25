package binarySearch;

import java.util.Arrays;

public class Cycle {


    public static void main(String[] args) {
        int [] arr={2,5,1,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void sort(int[] arr){
        int i=0;
        while(i < arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
    }
    static  void swap(int[]arr,int f,int s){
        int  temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
