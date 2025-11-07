package questions;

public class question_no3 {
    public static String skipAppNotApple(String s) {
        // Base case
        if (s.isEmpty()) return "";

        // If current string starts with "app" but not "apple"
        if (s.startsWith("app") && !s.startsWith("apple")) {
            // skip "app" (3 chars)
            return skipAppNotApple(s.substring(3));
        } else {
            // include first character and continue
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "bacappleappd";
        System.out.println(skipAppNotApple(str));  // Output: bacappled
    }
}
