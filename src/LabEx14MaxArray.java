public class LabEx14MaxArray {
    public static void main(String[] args) {
        int[] num = {12, 10, 15, 18, 17};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum number " + max);
    }
}
