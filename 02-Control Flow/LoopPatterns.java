public class LoopPatterns {
    public static void main(String[] args) {

        // 1. Counting Pattern
        int n1 = 5;

        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }


        // 2. Reverse Counting
        for (int i = n1; i >= 1; i--) {
            System.out.println(i);
        }


        // 3. Accumulation Pattern
        int sum1 = 0;

        for (int i = 1; i <= n1; i++) {
            sum1 += i;
        }

        System.out.println("Sum: " + sum1);


        // 4. Product Accumulation
        long product = 1;

        for (int i = 1; i <= n1; i++) {
            product *= i;
        }

        System.out.println("Product: " + product);


        // 5. Counting With Condition
        int count1 = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                count1++;
            }
        }

        System.out.println("Even Count: " + count1);


        // 6. Sum With Condition
        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                sum2 += i;
            }
        }

        System.out.println("Even Sum: " + sum2);


        // 7. Filtering Pattern
        int[] arr1 = {10, 15, 20, 25, 30};

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] % 2 != 0) {
                continue;
            }

            System.out.println(arr1[i]);
        }


        // 8. Search Pattern
        int[] arr2 = {10, 20, 30, 40};
        int target1 = 30;
        boolean found1 = false;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == target1) {
                found1 = true;
                break;
            }
        }

        System.out.println("Found: " + found1);


        // 9. Search and Return Index
        int target2 = 30;
        int index = -1;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == target2) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);


        // 10. Find Maximum
        int[] arr3 = {10, 50, 20, 80, 30};
        int max = arr3[0];

        for (int i = 1; i < arr3.length; i++) {

            if (arr3[i] > max) {
                max = arr3[i];
            }
        }

        System.out.println("Maximum: " + max);


        // 11. Find Minimum
        int min = arr3[0];

        for (int i = 1; i < arr3.length; i++) {

            if (arr3[i] < min) {
                min = arr3[i];
            }
        }

        System.out.println("Minimum: " + min);


        // 12. Count Positive Negative and Zero
        int[] arr4 = {10, -5, 20, -2, 0, 30};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr4.length; i++) {

            if (arr4[i] > 0) {
                positive++;
            } else if (arr4[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);


        // 13. Running Sum
        int[] arr5 = {1, 2, 3, 4, 5};
        int runningSum = 0;

        for (int i = 0; i < arr5.length; i++) {

            runningSum += arr5[i];

            System.out.println(runningSum);
        }


        // 14. Track Maximum
        int[] arr6 = {3, 8, 2, 10, 5};
        int max2 = arr6[0];

        for (int i = 1; i < arr6.length; i++) {

            if (arr6[i] > max2) {
                max2 = arr6[i];
            }
        }

        System.out.println("Maximum: " + max2);


        // 15. Second Largest
        int[] arr7 = {10, 50, 20, 80, 30};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr7.length; i++) {

            if (arr7[i] > largest) {
                second = largest;
                largest = arr7[i];
            } else if (arr7[i] > second && arr7[i] != largest) {
                second = arr7[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);


        // 16. Frequency of a Value
        int[] arr8 = {10, 20, 10, 30, 10, 40};
        int target3 = 10;
        int frequency = 0;

        for (int i = 0; i < arr8.length; i++) {

            if (arr8[i] == target3) {
                frequency++;
            }
        }

        System.out.println("Frequency: " + frequency);


        // 17. Check Sorted Array
        int[] arr9 = {10, 20, 30, 40, 50};
        boolean sorted = true;

        for (int i = 1; i < arr9.length; i++) {

            if (arr9[i] < arr9[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("Sorted: " + sorted);


        // 18. First Even
        int[] arr10 = {5, 7, 9, 12, 15};
        int firstEven = -1;

        for (int i = 0; i < arr10.length; i++) {

            if (arr10[i] % 2 == 0) {
                firstEven = arr10[i];
                break;
            }
        }

        System.out.println("First Even: " + firstEven);


        // 19. Last Even
        int[] arr11 = {5, 8, 9, 12, 15, 20};
        int lastEven = -1;

        for (int i = 0; i < arr11.length; i++) {

            if (arr11[i] % 2 == 0) {
                lastEven = arr11[i];
            }
        }

        System.out.println("Last Even: " + lastEven);


        // 20. Two Pointer Style
        int[] arr12 = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr12.length - 1;

        while (left < right) {

            System.out.println(arr12[left] + " " + arr12[right]);

            left++;
            right--;
        }


        // 21. Palindrome Array
        int[] arr13 = {1, 2, 3, 2, 1};

        int left2 = 0;
        int right2 = arr13.length - 1;
        boolean palindrome = true;

        while (left2 < right2) {

            if (arr13[left2] != arr13[right2]) {
                palindrome = false;
                break;
            }

            left2++;
            right2--;
        }

        System.out.println("Palindrome: " + palindrome);


        // 22. All Pairs
        int[] arr14 = {1, 2, 3, 4};

        for (int i = 0; i < arr14.length; i++) {

            for (int j = i + 1; j < arr14.length; j++) {
                System.out.println(arr14[i] + " " + arr14[j]);
            }
        }


        // 23. Count Pairs With Target Sum
        int[] arr15 = {1, 2, 3, 4, 5};
        int target4 = 5;
        int pairCount = 0;

        for (int i = 0; i < arr15.length; i++) {

            for (int j = i + 1; j < arr15.length; j++) {

                if (arr15[i] + arr15[j] == target4) {
                    pairCount++;
                }
            }
        }

        System.out.println("Pair Count: " + pairCount);


        // 24. Logarithmic Growth
        int n2 = 32;

        for (int i = 1; i <= n2; i *= 2) {
            System.out.println(i);
        }


        // 25. Halving Pattern
        int n3 = 32;

        while (n3 > 0) {
            System.out.println(n3);
            n3 /= 2;
        }


        // 26. Multiples
        int number = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }


        // 27. Digit Processing
        int number2 = 58321;

        while (number2 > 0) {

            int digit = number2 % 10;

            System.out.println(digit);

            number2 /= 10;
        }
    }
}