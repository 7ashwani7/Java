public class AppendChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(' ');
        sb.append('W');
        sb.append('o');
        sb.append('r');
        sb.append('l');
        sb.append('d');
        System.out.println(sb);
    }
}
