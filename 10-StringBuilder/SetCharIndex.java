public class SetCharIndex {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.setCharAt(0, 'h');
        sb.setCharAt(1, 'a');
        sb.setCharAt(2, 'l');
        sb.setCharAt(3, 'l');
        sb.setCharAt(4, 'o');
        System.out.println(sb);
    }
}
