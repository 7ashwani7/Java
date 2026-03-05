// Print all unique subsequences of a string
import java.util.HashSet;
public class UniqueSubsequences {
    public static void printUniqueSubsequences(String str, String subseq, HashSet<String> set) {
        if (str.isEmpty()) {
            if (!set.contains(subseq)) {
                System.out.println(subseq);
                set.add(subseq);
            }
            return;
        }
        char ch = str.charAt(0);
        printUniqueSubsequences(str.substring(1), subseq + ch, set);
        printUniqueSubsequences(str.substring(1), subseq, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequences("aaa", "", set);
    }
    
}
