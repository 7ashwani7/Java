// Print all subsets of a set
import java.util.ArrayList;
public class SubsetsOfSet {
    public static void printSubsets(ArrayList<Integer> set, ArrayList<Integer> subset, int index) {
        if (index == set.size()) {
            System.out.println(subset);
            return;
        }
        // Include the current element
        subset.add(set.get(index));
        printSubsets(set, subset, index + 1);
        // Exclude the current element
        subset.remove(subset.size() - 1);
        printSubsets(set, subset, index + 1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        ArrayList<Integer> subset = new ArrayList<>();
        printSubsets(set, subset, 0);
    }
   
}
