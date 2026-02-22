//Print all the permutations of a string.
public class AllPermutations {
    public static void permutations(String str, int index, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permutations(rest, index + 1, perm + ch);
        }
    }
    public static void main(String[] args) {
        permutations("abc", 0, "");
    }
    
}
