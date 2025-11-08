package String;

public class printAsciiOfChar {
    public static void main(String[] args) {
        // Start me function call kar rahe hain
        // "" → abhi tak kuch bhi select nahi kiya
        // "abc" → ye string ka subsequence banana hai
        subseq("", "abc");
    }

    static void subseq(String p , String up){
        // Jab unprocessed string khatam ho jaaye
        if(up.isEmpty()){
            // Agar processed string khali hai to ye empty subset hai
            if(p.isEmpty()) System.out.println("null");
            else System.out.println(p);
            return;
        }

        // Pehla character nikal lo
        char ch = up.charAt(0);

        // Character ko include karo
        subseq(p + ch, up.substring(1));

        // Character ko exclude karo
        subseq(p, up.substring(1));

        //ascii value print
        subseq(p+(int)ch,up.substring(1));
    }
}
