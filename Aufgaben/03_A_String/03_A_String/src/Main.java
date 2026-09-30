public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning Java output and getting to know Strings better" to the console.

        // Your code here
        String beispiel = "I am learning Java output and getting to know Strings better";
        System.out.println(beispiel);
        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        // Your code here
        String teil1 = "String";
        String teil2 = " concatenation";
        String teil3 = " works !";
        String result1 = teil1 + teil2 + teil3;
        System.out.println(result1);
        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.

        // Your code here
        char[] myCharacters = {'L','e','a','n','d','e','r'};
        String myStringChars = new String (myCharacters);
        System.out.println(myStringChars);
        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        //    (Obviously replace "..." with your first/last name).

        // Your code here
        String lastName = "Fux";
        String firstName = "Leander";

        System.out.println("My first name is " + firstName); /* Your code here */
        System.out.println("And my last name is " + lastName);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school = "Berufsfachschule";      // Complete this line
        String location = " Oberwallis";           // Complete this line

        // Do not change the following lines
        String result = school + " " + location;
        System.out.println(result);

        // What is the purpose of " " ?

        // Your answer here
        //mark the beginning and end of a text value
        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "Java" and print "I am learning Java!" using the variable.

        // Your code here
        String java = "I am learning Java!";
        System.out.println(java);
        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:
		// "" +
        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.

        // Your code here

        System.out.println("I am learning about\nescape characters.\nI need to look up\n\"escape characters\"\nto solve this task.");




    }
}