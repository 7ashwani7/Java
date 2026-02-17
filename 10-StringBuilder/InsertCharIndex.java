public class InsertCharIndex {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, 'W');
        sb.insert(6, 'o');
        sb.insert(7, 'r');
        sb.insert(8, 'l');
        sb.insert(9, 'd');
        System.out.println(sb);
    }
}
