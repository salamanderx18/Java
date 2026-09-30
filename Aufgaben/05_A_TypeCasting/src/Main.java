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


        // Your code here
        byte myByte = 100;
        short myShort = 30_000;
        int myInt = 100_000;
        long myLong = 400_000_000;
        float myFloat = 3.1415f;
        double myDouble = 3.1415926535d;
        myShort = myByte;
        myInt = myByte;
        myLong = myByte;
        myFloat = myByte;
        myDouble = myByte;
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        short myShort1 = 30_000;
        int myInt1 = 100_000;
        long myLong1 = 400_000_000;
        float myFloat1 = 3.1415f;
        double myDouble1 = 3.1415926535d;
        myInt1 = myShort1;
        myLong1 = myShort1;
        myFloat1 = myShort1;
        myDouble1 = myShort1;
        System.out.println(myInt1);
        System.out.println(myLong1);
        System.out.println(myFloat1);
        System.out.println(myDouble1);

        int myInt2 = 100_000;
        long myLong2 = 400_000_000;
        float myFloat2 = 3.1415f;
        double myDouble2 = 3.1415926535d;
        myLong2 = myInt2;
        myFloat2 = myInt2;
        myDouble2 = myInt2;
        System.out.println(myLong2);
        System.out.println(myFloat2);
        System.out.println(myDouble2);

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long myTest = 1234567890L;
        int myTest1 = (int) myTest;
        System.out.println(myTest1);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;
        // it will be 43

        // Try to guess first what happens, then test it.
        System.out.println(myNumber);

        // Can you explain what is happening?
        // it took the 33 not as a number but as just a value and you cant ad numbers to letters which means it put the 10 just behind everything

        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);
        int houseNumber = Integer.parseInt(houseNumberInString);
        System.out.println(houseNumber);
        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here

    }
}