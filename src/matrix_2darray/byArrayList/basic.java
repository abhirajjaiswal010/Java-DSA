package matrix_2darray.byArrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Create rows
        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add elements (like 2D array)
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);

        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);

        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);

        System.out.println(list);
    }
}
