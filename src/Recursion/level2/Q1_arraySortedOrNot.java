package level2;

public class Q1_arraySortedOrNot {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println( check(arr,0));
    }

    static boolean check(int[] arr,int index){
        if(index==arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;

        return check(arr,index+1);
    }
}
