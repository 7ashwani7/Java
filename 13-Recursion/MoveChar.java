//Move all ‘x’ to the end of the string. - O(n)
public class MoveChar {
    public static String moveX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        if (ch == 'x') {
            return moveX(rest) + ch;
        } else {
            return ch + moveX(rest);
        }
    }
    public static void main(String[] args) {
        System.out.println(moveX("axbxcxd"));
    }
}