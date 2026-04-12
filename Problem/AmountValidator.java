//ASHWANI CHAUHAN (2400320100318)//
import java.util.Scanner;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
public class AmountValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            if (amount < 0) {
                throw new NegativeAmountException(
                    "Invalid Amount: Negative value entered.");
            }
            System.out.println("Valid amount: " + amount);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

