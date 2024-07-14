public class LabEx005 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
            int number = i;
            while (number > 0) {
                if (number % 10 == 0) {
                    count++;
                }
                number /= 10;
            }
        }
        System.out.println("0 count:- " + count);
    }
}
