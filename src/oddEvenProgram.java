import java.util.Scanner;

public class oddEvenProgram {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//       System.out.println("Enter number");
//        int N = scanner.nextInt();
//        if(N%2==1 )
//        {
//            System.out.println("Weird");
//        }
//        else
//        {
//            if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N >= 6 && N <= 20) {
//                System.out.println("Weird");
//            } else if (N > 20) {
//                System.out.println("Not Weird");
//            }
//        }
//        scanner.close();

        oddEvenProgram odds=new oddEvenProgram();
        odds.findOddNumberList();
    }

    void findOddNumberList()
    {
        System.out.println("Enter number");
        int number= scanner.nextInt();
        for (int i=1;i<number;i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }

        }
    }
}

