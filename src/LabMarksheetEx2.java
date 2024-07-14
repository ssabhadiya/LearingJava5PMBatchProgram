import java.util.Scanner;

public class LabMarksheetEx2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Subject1 mark");
        int sub1=scan.nextInt();
        System.out.println("Enter Subject2 mark");
        int sub2=scan.nextInt();
        System.out.println("Enter Subject3 mark");
        int sub3=scan.nextInt();
        System.out.println("Enter Subject4 mark");
        int sub4=scan.nextInt();
        System.out.println("Enter Subject5 mark");
        int sub5=scan.nextInt();
        System.out.println("Enter Subject6 mark");
        int sub6=scan.nextInt();
        System.out.println("Enter Subject7 mark");
        int sub7=scan.nextInt();
        double totalMarks=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
        System.out.printf("Subject1 mark:- %d\n",sub1);
        System.out.printf("Subject1 mark:- %d\n",sub2);
        System.out.printf("Subject1 mark:- %d\n",sub3);
        System.out.printf("Subject1 mark:- %d\n",sub4);
        System.out.printf("Subject1 mark:- %d\n",sub5);
        System.out.printf("Subject1 mark:- %d\n",sub6);
        System.out.printf("Subject1 mark:-  %d\n",sub7);
        System.out.println("Total mark:- "+totalMarks);
        double percentage=totalMarks/7;
        System.out.println(percentage);
        if (percentage>=90)
        {
            System.out.println("A+ Grade");
        }
        else if (percentage>=80 & percentage<90)
        {
            System.out.println("A Grade");
        }
        else if (percentage>=70 & percentage<80)
        {
            System.out.println("B+ Grade");
        }
        else if (percentage>=60 & percentage<70)
        {
            System.out.println("B Grade");
        }
        else if (percentage>=50 & percentage<60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("You are failed");
        }
        
    }
}
