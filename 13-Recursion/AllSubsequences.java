//Print all the subsequences of a string.
public class AllSubsequences {
    public static void printSubsequences(String str, String subseq) {
        if (str.isEmpty()) {
            System.out.println(subseq);
            return;
        }
        char ch = str.charAt(0);
        printSubsequences(str.substring(1), subseq + ch);
        printSubsequences(str.substring(1), subseq);
    }
    public static void main(String[] args) {
        printSubsequences("abc", "");
    }
}