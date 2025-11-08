package String;

import java.util.ArrayList;

public class subSequenceArrayList {


    public static void main(String[] args) {
        // Call the function
        ArrayList<String> ans = subseq("", "abc");
        System.out.println(ans); // print all subsequences together
    }

    // Function returns all subsequences as ArrayList
    static ArrayList<String> subseq(String p , String up){

        // Base condition: jab unprocessed string khatam ho jaaye
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            if(p.isEmpty()) list.add("null"); // empty subset
            else list.add(p);

            return list; // return one-element list
        }

        // Pehla character nikal lo
        char ch = up.charAt(0);

        // 🔹 Recursion call 1: include character
        ArrayList<String> left = subseq(p + ch, up.substring(1));

        // 🔹 Recursion call 2: exclude character
        ArrayList<String> right = subseq(p, up.substring(1));

        // 🔹 Combine dono lists ko
        left.addAll(right);

        return left; // final combined result
    }
}
