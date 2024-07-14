import java.util.Scanner;

public class oddEvenProgram {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number");
        int N = scanner.nextInt();
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();

        oddEvenProgram odds = new oddEvenProgram();
//        odds.findOddNumberList();
//        odds.findOddNumberListWithWhile();
//        odds.findOddNumberListWithWhileNoIf();
//        odds.findEvenNumberListWithWhileNoIf();
//        odds.breakJumpingStatement();
//        odds.continueJumpingStatement();
//        odds.continueJumpingStatementWithForLoop();
//        odds.continueJumpingStatement();
//        odds.oddEvenDigitCountFromNumber();
//        odds.reverseNumber();
//        odds.countNumberFromDigit();
//        odds.CheckPalindromNumber();
//        odds.reverseNumber();
//        odds.countOddEvenNumberFromNumber();
        odds.oddEvenDigitCountFromNumberSeries();
    }

    void findOddNumberList() {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    void findOddNumberListWithWhile() {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    void findEvenNumberListWithWhileNoIf() {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int i = 2;
        while (i <= number) {
            System.out.println(i);
            i += 2;
        }
    }

    void findOddNumberListWithWhileNoIf() {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i += 2;
        }
    }

    void breakJumpingStatement() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
            i++;
        }
    }

    void continueJumpingStatement() {
        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }

    void continueJumpingStatementWithForLoop() {
        for (int i = 1; i < 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }

    }


    void countOddEvenNumberFromNumber() {
        int number = 123456;
        int countOdd = 0;
        int countEven = 0;
        int digit;
        for (; number != 0; number /= 10) {
            {
                digit = number % 10;
                if (digit % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println("The number of odd digits is: " + countOdd);
        System.out.println("The number of even digits is: " + countEven);
    }

    void countOddEvenNumberFromNumbers() {
        int number = 123456;
        int countOdd = 0;
        int countEven = 0;
        int digit;
        for (; number != 0; number /= 10) {
            {
                digit = number % 10;
                if (digit % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println("The number of odd digits is: " + countOdd);
        System.out.println("The number of even digits is: " + countEven);
    }

    void oddEvenDigitCountFromNumberSeries() {
        int countOdd = 0;
        int countEven = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("The number of odd digits is: " + countOdd);
        System.out.println("The number of even digits is: " + countEven);
    }

    void reverseNumber() {
        int number = 123456;
        int reversenumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversenumber = reversenumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("Reverse number " + reversenumber);
    }

    void countNumberFromDigit() {
        int number = 123456;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Total digit count" + count);
    }

    void CheckPalindromNumber() {
        int number = 121;
        int reversenumber = 0;
        int temp = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reversenumber = reversenumber * 10 + lastDigit;
            number /= 10;
        }
        if (temp == reversenumber) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

}

// break - break the loop
// Continue - only break the current interation and execute next loop
// break and continue statement

//  /=  - aa operator number mathi last digit remove kare
//  number % 10 =   aa condition mathi always number no last didit male 10 thi divide kariye to 123456/10

