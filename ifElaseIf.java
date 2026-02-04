
import java.util.Scanner;

public class ifElaseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
            if (marks>=90){
                System.out.println("A");
            }else if (marks>=80 && marks<90){
                System.out.println("B");
            }else if (marks>=70 && marks<80){
                System.out.println("C");
            }else if (marks>=60 && marks<70){
                System.out.println("D");
            }else if (marks>=50 && marks <60){
                System.out.println("E");
            }else if (marks>=40 && marks<50){
                System.out.println("F");
            }else{
                System.out.println("Fail");
                
            }
    }
}
