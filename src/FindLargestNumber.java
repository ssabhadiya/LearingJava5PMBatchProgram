import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
FindLargestNumber findLargestNumber=new FindLargestNumber();
     // findLargestNumber.findLargestNumberWithIfElse();
      //  findLargestNumber.findLargestNumberWithTernaryOperator();
    //  findLargestNumber.checkEligibleForVoteWithIfElse();
     //   findLargestNumber.checkEligibleForVoteWithTernaryOperator();
        findLargestNumber.bmiCalculate();
    }
    void findLargestNumberWithIfElse()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number(a)");
        int a=scan.nextInt();
        System.out.println("Enter the second number(b)");
        int b=scan.nextInt();
        if(a>b)
        {
            System.out.println("a is largest number: "+a);
        }
        else
        {
            System.out.println("B is largest number: "+b);
        }
    }

    void findLargestNumberWithTernaryOperator()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number(a)");
        int a=scan.nextInt();
        System.out.println("Enter the second number(b)");
        int b=scan.nextInt();
        String result= a > b ? "a is largest number:" : "B is largest number" +b;
        System.out.println(result);
    }

    void checkEligibleForVoteWithIfElse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age)");
        int vote = scan.nextInt();
        if (vote>18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
    }
    void checkEligibleForVoteWithTernaryOperator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age)");
        int vote = scan.nextInt();
        String result= vote > 18 ? "You are eligible for voting" : "You are not eligible for voting";
        if (vote>18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
    }

    void bmiCalculate()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your BMI");
        int bmiValue=scan.nextInt();
        if (bmiValue < 20)
        {
            System.out.println("You are underWeight");
        }
        else if (bmiValue > 20 && bmiValue < 25)
        {
            System.out.println("Your weight is Normal");
        }
        else if (bmiValue > 25 && bmiValue < 30)
        {
            System.out.println("Your weight is over");
        }
        else {
            System.out.println("Your weight is Obesity");
        }
        }
}
