public class Labex13MinArray {
    public static void main(String[] args) {

        int[] num7 = {5, 2, 1, 3, 4, 7, 6};
        int min = num7[0];
        for (int i = 0; i < num7.length; i++) {
            if (num7[i] < min) {
                min = num7[i];
            }
        }
        System.out.println("Smallest number in array" + min);
    }
}
