// Bitwise Operator are  
// 1. Bitwise AND (&)
// 2. Bitwise OR (|)
// 3. Bitwise XOR (^)
// 4. Bitwise Left shift (<<)
// 5. Bitwise Right shift (>>)
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 8, b = 3;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << b); //ans = a*2power b
        System.out.println(a >> b); //ans = a/2power b
    }
}