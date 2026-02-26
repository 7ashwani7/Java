//Find the occurrence of the first and last occurrence of an element using recursion
public class Occurrence {
    public static int first = -1;
    public static int last = -1;
    public static void getIndex(String str, char el, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) == el) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        getIndex(str, el, index + 1);
    } 
    public static void main(String[] args) {
        String str = "hello world";
        char el = 'o';
        getIndex(str, el, 0);
        System.out.println("First occurrence of '" + el + "' is at index: " + first);
        System.out.println("Last occurrence of '" + el + "' is at index: " + last);
    }
    
}
