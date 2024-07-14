import java.util.Scanner;

public class LabEx0010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linenumber = 1;
        while (scan.hasNext()) {
            String line = scan.nextLine();
            System.out.println(linenumber + " " + line);
            linenumber++;
        }
        scan.close();
    }
}
