public class permutation {

    public static void permute(String remaining, String built) {

        // Base Case
        if (remaining.isEmpty()) {
            System.out.println(built);
            return;
        }

        // Recursive Case
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);

            String left = remaining.substring(0, i);
            String right = remaining.substring(i + 1);
            String next = left + right;

            permute(next, built + ch);
        }
    }

    public static void main(String[] args) {
        permute("anshu", "");
    }

}
