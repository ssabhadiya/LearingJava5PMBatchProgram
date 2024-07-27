import java.util.Arrays;

public class LabEx12Array {
    public static void main(String[] args) {

        int[] num1 = new int[5];
        int num2[] = new int[5];
        num2[0] = 10;
        num2[1] = 15;
        num2[2] = 20;
        num2[3] = 25;
        num2[4] = 30;
        //  System.out.println(num2[0]);

        // Simple for loop
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

        // for each loop

        for (int x : num2) {
            System.out.println(x);
        }

        int[] num3 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(num3[0]);
        for (int j = 0; j < num3.length; j++) {
            System.out.println(num3[j]);
        }

        //  String Array
        String[] colors = {"Red", "Green", "Blue", "Pink", "Black", "Yellow"};
        for (int k = 0; k < colors.length; k++) {
            System.out.println(colors[k]);
            System.out.println(colors[k]);
        }

        int[] arr = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("The original array is: ");
        for (int y : arr) {
            System.out.print(" " + y);
        }
        Arrays.sort(arr);
        System.out.println("The sorting array is: ");
        for (int y : arr) {
            System.out.print(" " + y);
        }
        System.out.println();
        /*

        dataType[][] arrayRefVar; (or)
        dataType [][]arrayRefVar; (or)
        dataType arrayRefVar[][]; (or)
        dataType []arrayRefVar[];
         */

        int[][] sa1;
        int[][] sa2;
        int sa3[][];
        int[] sa4[];

        // Multi dimensional array
        int[][] m = new int[3][3]; // 3 row 3 column

        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[1][0] = 4;
        m[1][1] = 5;
        m[1][2] = 6;
        m[2][0] = 7;
        m[2][1] = 8;
        m[2][2] = 9;

        int[][] s5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int l = 0; l <= s5.length - 1; l++) {
            for (int n = 0; n <= s5.length - 1; n++) {
                System.out.print(s5[l][n] + " ");
            }
            System.out.println();
        }

        // Sum of all element in array
        int[] num5 = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int o = 0; o < num5.length; o++) {
            System.out.println(num5[o]);
            sum = sum + num5[o];
        }
        System.out.println("Array summation : " + sum);

        // Find even and odd number in array
        int[] num6 = {1, 2, 3, 4, 5, 6, 7};
        int oddCount = 0, evenCount = 0;
        for (int p = 0; p < num5.length; p++) {
            if (num6[p] % 2 == 0) {
                System.out.println("even : " + num6[p]);
                evenCount++;
            } else {
                System.out.println("Odd : " + num6[p]);
                oddCount++;
            }
        }
        System.out.println("Event number in Array :" + evenCount);
        System.out.println("Odd number in Array : " + oddCount);

        // find smallest number in array

        int[] num7 = {1, 2, 3, 4, 5, 6, 7};
        int min = num7[0];
        for (int i = 0; i < num7.length; i++) {
            if (num7[i] < min) {
                min = num7[i];
            }
        }
        System.out.println("Smallest number in array" + min);

        // find largest number in array
        int[] num8 = {1, 2, 3, 4, 5, 6, 7};
        int max = num8[0];
        for (int i = 0; i < num8.length; i++) {
            if (num8[i] > max) {
                max = num8[i];
            }
        }
        System.out.println("largest number in array" + max);
    }
}
