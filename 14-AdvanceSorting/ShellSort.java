public class ShellSort {
    public static void shellSort(int[] nums) {
        int n = nums.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = nums[i];
                int j;
                for (j = i; j >= gap && nums[j - gap] > temp; j -= gap) {
                    nums[j] = nums[j - gap];
                }
                nums[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {12, 34, 54, 2, 3};
        shellSort(data);
        for(int i=0; i<5; i++){
            System.out.print(data[i] + " ");
        }
    }
}

