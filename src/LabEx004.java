public class LabEx004 {
    public static void main(String[] args) {
        int a = 10;
        // System.out.println(a++ ++a + a++);
        //       System.out.println(--a + ++a + a++ + ++a);
        //    System.out.println(a);

        //     System.out.println(++a + a++ + a++);

        System.out.println("--------------");
        System.out.println(++a + ++a + a-- + --a + ++a + a++);
        System.out.println(a);
// Evaluates as follows:
// ++a -> a is pre-incremented to 11
// a++ -> a's current value (11) is used, then a is post-incremented to 12
// a++ -> a's current value (12) is used, then a is post-incremented to 13
// So the expression becomes: 11 + 11 + 12
// Which is: 34

        /*

        // a++ - a=10 then a

        Given that a is initially 10, let's evaluate the expression:

a++: This is the first operation. The postfix increment returns the current value of a (which is 10), and then increments a by 1. So after this operation, a becomes 11, but for this part of the expression, 10 is used.

++a: Now a is 11 from the previous increment. The prefix increment then increments a before it is used in the expression, so a becomes 12, and 12 is the value used in this part of the expression.

a++: Finally, a is 12 from the previous operation. The postfix increment returns the current value of a (which is 12), and then increments a by 1. So after this operation, a becomes 13, but for this part of the expression, 12 is used.
         */
    }
}


/*

System.out.println(++a +     ++a +   a-- + --a + ++a + a++)

A -> ++a -> a is pre decrement first now a is 11 == 11

+

B -> ++a -> Now a values is 11 and pre decrement now a is 12 = 12

+
11+12+12
C -> a-- -> Now a is 12 then a is decreement now a is 11 = 12

+
11+12+12+11
D -> --a -> Now a is 11 and a is pre decrement now a value is 10 = 11

+
11+12+12+11+10
E -> ++a -> now a is 10 and a is pre decrement now a value is 11 = 12
11+12+12+11+10+11
+
F -> a++ -> now  a is 12 the  poset decrment now a value is = 13



 */