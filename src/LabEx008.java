import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabEx008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int cal = 0;
        for (int i = 1; i <= 10; i++) {
            cal = N * i;
            System.out.println(N + " * " + i + " = " + +cal);

        }
        bufferedReader.close();
    }
}
