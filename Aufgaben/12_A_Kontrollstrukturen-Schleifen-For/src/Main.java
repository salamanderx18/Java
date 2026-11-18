public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
              for (int iteratorEx1 = 0; iteratorEx1 < 10; iteratorEx1 ++ ) {
                  System.out.println("iteratorEx1:" + iteratorEx1 + " ");
              }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? it would print the text forever because it has nothing that changes
        //      2. Why does this behavior occur? Nothing adds to iteratorEx1
        //      3. How can you modify the code to achieve the desired output: add a condition
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-07. -10 to 20
        //      02-06. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)

        for ( int i1 = 0; i1 <= 100; i1++) {
            System.out.println("i1 : " + i1);
        }

        for ( int i2 = 42; i2 <= 100; i2++) {
            System.out.println("i2 : " + i2);
        }

        for ( int i3 = 42; i3 <= 123; i3 ++) {
            System.out.println("i3 : " + i3);
        }

        for (int i4 = 0; i4 <= 10; i4 += 2 ) {
            System.out.println("i4 : " + i4);
        }

        for (int i5 = 1; i5 <= 10; i5 += 2) {
            System.out.println("i5 : " + i5);
        }

        for (int i6 = 35; i6>= 0; i6 --) {
            System.out.println("i6 : " + i6);
        }

        for (int i7 = -10 ; i7 <= 20; i7 ++) {
            System.out.println("i7 : " + i7);
        }

        for (int i8 = 15; i8>= -20; i8 --) {
            System.out.println("i8 : " + i8);
        }

        for (int i9 = 10; i9 >= -10; i9 -= 2) {
            System.out.println("i9 : " + i9);
        }

        for (int i10 = 11; i10 >= -10; i10 -= 2) {
            System.out.println("i10 : " + i10);
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        for (int counter = 0; counter <= 100; counter++) {
            forSum_03 += counter;
        }

        // Your code here

        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        for (int counter2 = 0; counter2 <= 100; counter2 += 2) {
            forSum_04 += counter2;
        }

        // Your code here

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        for (int counter3 = 1; counter3<= 100; counter3 +=2) {
            forSum_05 += counter3;
        }

        // Your code here

        System.out.println(forSum_05); // Should be 2500

    }
}