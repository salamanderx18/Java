import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
              int iteratorEx1 = 0;
              while (iteratorEx1 < 10) {
                  System.out.println("iteratorEx1:" + iteratorEx1++);
              }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? it would run until your pc crashes
        //      2. Why does this behavior occur? because it has no end for the loop
        //      3. How can you modify the code to achieve the desired output: add ++ so eventually it stops
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)
        int number1 = 0;
        int number2 = 42;
        int number4 = 0;
        int number5 = 1;
        int number6 = -10;
        int number7 = 35;
        int number8 = 15;
        int number9 = 10;
        int number10 = 10;

        while (number1 <= 100 ) {
            System.out.println("number1:" + number1++);
        }
        while (number2 <= 100 ) {
            System.out.println("number2:" + number2++);
        }
        while (number2 <= 123 ) {
            System.out.println("number2:" + number2++);
        }
        while (number4 <= 10 ) {
            if (number4 % 2 == 0 )
            System.out.println("number4:" + number4++ );
            else
                number4++ ;
        }
        while (number5 <= 10 ) {
            if (number5 % 2 == 0 )
                number5 ++;
            else
                System.out.println("number5:" + number5++ );
        }
        while (number6 <= 20 ) {
            System.out.println("number6:" + number6++ );
        }
        while (number7 >= 0 ) {
            System.out.println("number7:" + number7-- );
        }
        while (number8 >= -20 ) {
            System.out.println("number8:" + number8-- );
        }
        while (number9 >= -10 ) {
            if (number9 % 2 == 0 )
                System.out.println("number9:" + number9-- );
            else
                number9-- ;
        }
        while (number10 >= -10 ) {
            if (number10 % 2 == 0 )
                number10 --;
            else
                System.out.println("number10:" + number10-- );
        }






        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int counter = 0;
        int whileSum_03 = 0;
        while (counter <= 100) {
           whileSum_03 += counter;
           counter++;
        }

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;
        int sum2 = 0;

                while (sum2 <= 100) {
                    whileSum_04 += sum2;
                    sum2 += 2 ;
                }

        // Your code here

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;
        int sum3 = 1;

        while (sum3 <= 100) {
            whileSum_05 += sum3;
            sum3 += 2 ;
        }

        // Your code here

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;
        while (randomNumber != 22){
            randomNumber = randomGenerator.nextInt(101);
            iterationSteps++;
        }


        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}