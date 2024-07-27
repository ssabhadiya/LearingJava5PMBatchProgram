import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        // logic - Input is 5 = 1 * 2 * 3 * 4 * 5 = 120
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(" Factorial is : " + factorial);
    }
}
