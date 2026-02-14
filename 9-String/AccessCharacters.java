public class AccessCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("The string is: " + str);
        System.out.println("The first character is: " + str.charAt(0));
        System.out.println("The second character is: " + str.charAt(1));
        System.out.println("The third character is: " + str.charAt(2));
        System.out.println("The last character is: " + str.charAt(str.length() - 1));
    }
    
}
