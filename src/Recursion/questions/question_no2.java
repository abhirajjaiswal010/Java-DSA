package questions;

public class question_no2 {
    public static String skip(String s, String target) {
        // base case
        if (s.isEmpty()) return "";

        // if the current string starts with target, skip it
        if (s.startsWith(target)) {
            return skip(s.substring(target.length()), target);
        } else {
            // otherwise include the first character
            return s.charAt(0) + skip(s.substring(1), target);
        }
    }

    public static void main(String[] args) {
        String str = "abhiraj";
        System.out.println(skip(str, "raj"));  // Output: bcdef
    }
}
