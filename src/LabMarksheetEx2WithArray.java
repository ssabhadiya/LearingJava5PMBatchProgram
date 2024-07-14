import java.util.Scanner;

public class LabMarksheetEx2WithArray {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
         int numberOfSubject=7;
         boolean iSFailed=false;
         int[] subject=new int[7];

         for (int i=0;i<numberOfSubject;i++)
         {
             System.out.println("Enter Subject "+(i+1)+" Mark");
             subject[i]=scan.nextInt();
             if (subject[i]<35)
             {
                 iSFailed=true;
             }
         }
         double totalMarks=0;
         for (int mark:subject)
         {
             totalMarks +=mark;
         }
        // Print individual marks
        for (int i = 0; i < 7; i++) {
            System.out.printf("Subject%d mark: %d\n", i + 1, subject[i]);
        }
        System.out.println("Total mark: " + totalMarks);
        if (!iSFailed)
        {
            double percentage=totalMarks/7;
            System.out.println("Percentage: "+percentage);
            if (percentage>=90) {
                System.out.println("A+ Grade");
            } else if (percentage>=80) {
                System.out.println("A+ Grade");
            }
            else if (percentage>=70) {
                System.out.println("B+ Grade");
            }
            else if (percentage>=60) {
                System.out.println("B Grade");
            }
            else if (percentage>=50) {
                System.out.println("C Grade");
            }
        }
        else
        {
            System.out.println("You are failed due to scoring less than 35 in one or more subjects.");
        }
        scan.close();

    }
}
