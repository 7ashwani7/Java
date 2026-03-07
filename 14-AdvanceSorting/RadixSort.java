import java.util.Arrays;
public class RadixSort {
    public static int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static void countSort(int[] nums, int exp) {
        int n = nums.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(nums[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(nums[i] / exp) % 10] - 1] = nums[i];
            count[(nums[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, nums, 0, n);
    }

    public static void radixSort(int[] nums) {
        int max = getMax(nums);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(nums, exp);
        }
    }

    public static void main(String[] args) {
        int[] data = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(data);
        System.out.println(Arrays.toString(data));
    }
}

