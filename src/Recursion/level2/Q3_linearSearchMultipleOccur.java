package level2;

import java.util.ArrayList;

public class Q3_linearSearchMultipleOccur {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,6,5};
        check(arr,0,4);
        System.out.println( list);
    }
static ArrayList<Integer> list= new ArrayList<>();
    static void check(int[] arr,int index,int target){
        if(index==arr.length-1)
            return;
        if(target==arr[index])
            list.add(index);



        check(arr,index+1,target);
    }
}
