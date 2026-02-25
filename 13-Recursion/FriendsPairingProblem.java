// FriendsPairingProblem
public class FriendsPairingProblem {
    public static int countPairings(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return countPairings(n - 1) + (n - 1) * countPairings(n - 2);
    }
    public static void main(String[] args) {
        int n = 4; // Number of friends
        System.out.println("Number of ways to pair " + n + " friends: " + countPairings(n));
    }
    
}
