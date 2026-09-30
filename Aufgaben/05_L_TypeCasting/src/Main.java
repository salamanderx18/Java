public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.

        byte b = 10;
        short s;
        char c = 10;
        int i;
        long l;
        float f;
        double d;

        // Casting byte down
        s = b;
        // c = b;
        i = b;
        l = b;
        f = b;
        d = b;

        // Casting short down
        //  c = s;
        i = s;
        l = s;
        f = s;
        d = s;

        // Casting char down
        i = c;
        l = c;
        f = c;
        d = c;

        // Casting int down
        l = i;
        f = i;
        d = i;

        // Casting long down
        f = l;
        d = l;

        // Casting float down
        d = f;


        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long myLong = 1234567890L;
        int myInt = (int) myLong;
        System.out.println(myInt); // 1234567890


        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:
        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        System.out.println(myNumber);

        // Can you explain what is happening?
        // It will cast everything to a String,
        // and then adding 10 to 33 as a String


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        int houseNumber = Integer.parseInt(houseNumberInString);
        // or
        int houseNumber_2 = Integer.valueOf(houseNumberInString); // Redundant boxing, 'Integer.parseInt()' call can be used instead
        System.out.println(houseNumber);
        System.out.println(houseNumber_2);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here

        // If not a number but something invalid is passed, like 'abc', the program will throw an exception.
        // Example below will throw an exception

        String notANumber = "abc";
        // Comment this line out and run the program to see the exception
        // int willThrowError = Integer.parseInt(notANumber);
    }
}