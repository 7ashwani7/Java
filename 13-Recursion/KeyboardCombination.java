//  Print keypad combination
//(0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz
// )
public class KeyboardCombination {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombination(String str, int index, String res) {
        if (index == str.length()) {
            System.out.println(res);
            return;
        }
        for(int i=0; i<keypad[str.charAt(index)-'0'].length(); i++) {
        char curr = keypad[str.charAt(index)-'0'].charAt(i);
        printCombination(str, index + 1, res + curr);
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, "");
    }
    
}
