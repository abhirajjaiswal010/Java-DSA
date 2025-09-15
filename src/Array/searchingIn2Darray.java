public class searchingIn2Darray {
static boolean search(int[][] arr , int key ){

    for(int i = 0; i <arr.length ; i++) {
        for(int j = 0; j <arr[i].length; j++) {

            if(arr[i][j]==key){
                return true;
            }
        }

    }
    return false;
}

    public static void main(String[] args) {
        int[][] arr = {
               {5, 8, 3},
               {9, 2, 6},
               {4, 7, 1}
        };
        int key =45 ;

        if(search(arr,key)){
            System.out.println("element is found ");
        }
        else
            System.out.println("element is not found");
    }
}
