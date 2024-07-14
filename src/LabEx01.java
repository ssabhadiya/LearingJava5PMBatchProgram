public class LabEx01 {
    public static void main(String[] args) {
        LabEx01 labex01 = new LabEx01();
        labex01.postDecreement();
    }

    void postIncreement() {
        int a = 100;
        int result = a++;
        System.out.println(result);
        System.out.println(a);
    }

    void preIncreement() {
        int a = 100;
        int result = ++a;
        System.out.println(result);
        System.out.println(a);
    }

    void postDecreement() {
        int a = 100;
        int result = a--;
        System.out.println(result);
        System.out.println(a);
    }

    void preDecreement() {
        int a = 100;
        int result = --a;
        System.out.println(result);
        System.out.println(a);
    }
}
