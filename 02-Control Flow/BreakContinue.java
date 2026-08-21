public class BreakContinue {
    public static void main(String[] args) {

        // 1. Basic Break
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }


        // 2. Break in While Loop
        int i1 = 1;

        while (i1 <= 10) {

            if (i1 == 6) {
                break;
            }

            System.out.println(i1);
            i1++;
        }


        // 3. Break in Do While
        int i2 = 1;

        do {

            if (i2 == 4) {
                break;
            }

            System.out.println(i2);
            i2++;

        } while (i2 <= 10);


        // 4. Basic Continue
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }


        // 5. Print Odd Numbers
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }


        // 6. Skip Multiples of 3
        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }


        // 7. Break When Value Is Found
        int[] arr1 = {10, 20, 30, 40, 50};
        int target = 30;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == target) {
                System.out.println("Found at index: " + i);
                break;
            }
        }


        // 8. Search With Break
        int[] arr2 = {5, 8, 12, 17, 20};
        int target2 = 17;
        boolean found = false;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == target2) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }


        // 9. Continue in Array Traversal
        int[] arr3 = {10, -5, 20, -2, 30};

        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 0) {
                continue;
            }

            System.out.println(arr3[i]);
        }


        // 10. Sum Only Positive Numbers
        int[] arr4 = {10, -5, 20, -2, 30};
        int sum = 0;

        for (int i = 0; i < arr4.length; i++) {

            if (arr4[i] < 0) {
                continue;
            }

            sum += arr4[i];
        }

        System.out.println("Positive Sum: " + sum);


        // 11. Break in Nested Loops
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    break;
                }

                System.out.println(i + " " + j);
            }
        }


        // 12. Continue in Nested Loops
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    continue;
                }

                System.out.println(i + " " + j);
            }
        }


        // 13. Labeled Break
        outer:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break outer;
                }

                System.out.println(i + " " + j);
            }
        }


        // 14. Labeled Continue
        outer:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    continue outer;
                }

                System.out.println(i + " " + j);
            }
        }


        // 15. First Even Number
        int[] arr5 = {5, 7, 9, 12, 15, 20};

        for (int i = 0; i < arr5.length; i++) {

            if (arr5[i] % 2 == 0) {
                System.out.println("First Even: " + arr5[i]);
                break;
            }
        }


        // 16. First Negative Number
        int[] arr6 = {10, 20, 30, -5, 40, -2};

        for (int i = 0; i < arr6.length; i++) {

            if (arr6[i] < 0) {
                System.out.println("First Negative: " + arr6[i]);
                break;
            }
        }


        // 17. Skip Zero Values
        int[] arr7 = {10, 0, 20, 0, 30};

        for (int i = 0; i < arr7.length; i++) {

            if (arr7[i] == 0) {
                continue;
            }

            System.out.println(arr7[i]);
        }


        // 18. First Duplicate
        int[] arr8 = {2, 5, 7, 2, 9};
        boolean duplicate = false;

        for (int i = 0; i < arr8.length; i++) {

            for (int j = i + 1; j < arr8.length; j++) {

                if (arr8[i] == arr8[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                break;
            }
        }

        System.out.println("Duplicate: " + duplicate);


        // 19. Safe Continue in While
        int i3 = 1;

        while (i3 <= 5) {

            i3++;

            if (i3 == 3) {
                continue;
            }

            System.out.println(i3);
        }
    }
}