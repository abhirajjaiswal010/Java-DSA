package level2;

public class Q2_linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5};
        System.out.println( check(arr,0,4));
    }

    static int check(int[] arr,int index,int target){
        if(index==arr.length-1)
            return -1;
        if(target==arr[index])
            return index;



        return check(arr,index+1,target);
    }
}
