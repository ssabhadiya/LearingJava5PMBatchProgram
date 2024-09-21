package Sat10Aug;

public class GenericDemo<T1> {
    T1 id;
    T1 str;

    public static void main(String[] args) {
        GenericDemo<Integer> g1 = new GenericDemo<>();
        g1.id = 1;
        //   genericDemo.str="sandip";

        GenericDemo2<Integer, String> genericDemo2 = new GenericDemo2<>();
        genericDemo2.id = 1;
        System.out.println(genericDemo2.id);
        genericDemo2.str = "Sandip";
        System.out.println(genericDemo2.str);
    }
}

class GenericDemo2<T1, T2> {
    T1 id;
    T2 str;
}
