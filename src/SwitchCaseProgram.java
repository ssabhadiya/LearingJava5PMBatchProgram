import java.util.Scanner;

public class SwitchCaseProgram {
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        SwitchCaseProgram switchcaseprogram=new SwitchCaseProgram();
     //   switchcaseprogram.simpleSwitch();
      //  switchcaseprogram.simpleSwitchMonthProgram();
     //   switchcaseprogram.simpleSwitchMonthProgramWithDiffLogic();
      //  switchcaseprogram.checkVowelCharacter();
        switchcaseprogram.checkVowelCharacterInString();
    }
    void simpleSwitch()
    {
        int number=10;
        switch (number)
        {
            case 10: System.out.println("First case");
                break;
            case 20:System.out.println("second case");
                break;
            default:System.out.println("no case");
        }
    }

    void simpleSwitchMonthProgram()
    {

        System.out.println("Enter month in Number(Ex. 1)");
        int month=scan.nextInt();
        switch (month)
        {
            case 1: System.out.println("1 - January");
            break;
            case 2: System.out.println("2 - February");
            break;
            case 3: System.out.println("3 - March");
            break;
            case 4: System.out.println("4 - April");
            break;
            case 5: System.out.println("5 - May");
            break;
            case 6: System.out.println("6 - June");
            break;
            case 7: System.out.println("7 - July");
            break;
            case 8: System.out.println("8 - August");
            break;
            case 9: System.out.println("9 - September");
            break;
            case 10: System.out.println("10 - October");
            break;
            case 11: System.out.println("11 - November");
            break;
            case 12: System.out.println("1 - December");
            break;
            default: System.out.println("Month number is invalid");
        }
    }

    void simpleSwitchMonthProgramWithDiffLogic()
    {
        System.out.println("Enter month in Number(Ex. 1)");
        int month=scan.nextInt();
        String monthName="";
        switch (month)
        {
            case 1: monthName="1 - January";
                break;
            case 2: monthName="2 - February";
                break;
            case 3: monthName="3 - March";
                break;
            case 4: monthName="4 - April";
                break;
            case 5:monthName="5 - May";
                break;
            case 6: monthName="6 - June";
                break;
            case 7: monthName="7 - July";
                break;
            case 8: monthName="8 - August";
                break;
            case 9: monthName="9 - September";
                break;
            case 10: monthName="10 - October";
                break;
            case 11: monthName="11 - November";
                break;
            case 12: monthName="1 - December";
                break;
            default: monthName="Month number is invalid";
        }
        System.out.println(monthName);
    }

    void checkVowelCharacter()
    {System.out.println("Enter Vowel character");
       char ch=scan.next().charAt(0);
       switch (ch)
       {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           System.out.println("Vowel is: "+ch);
           break;
           default:System.out.println("No Vowel");
       }
    }
    void checkVowelCharacterInString()
    {
        System.out.println("Enter a String");
        String stringInput=scan.nextLine();
        int vowelCount=0;
        for (int i=0;i<stringInput.length();i++)
        {
            char ch=stringInput.charAt(i);
            switch (Character.toLowerCase(ch))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:break;
            }
        }
        System.out.println("The number of vowels in the string is: " + vowelCount);
        scan.close();

    }
}
