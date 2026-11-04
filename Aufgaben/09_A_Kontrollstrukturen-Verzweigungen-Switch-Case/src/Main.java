import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        System.out.println("Give me a number from 1-7");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String answer = switch (number) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Not a weekday";
        };
        System.out.println(answer);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        System.out.println("Give me an month");
        String month = scanner.nextLine();
        String season = switch (month) {
            case "January","February","December" -> "Winter";
            case "March","April","May" -> "Spring";
            case "June","July","August" -> "Summer";
            case "September","October","November" -> "Autumn";
            default -> "Not a month";

        };
        System.out.println(season);

        String result;
        System.out.println("Give me a month");
        String month2 = scanner.nextLine();
        switch (month2) {
            case "January":
            case "February":
            case "December":
                result = "Winter";
                break;
            case "March":
            case "April":
            case "May":
                result = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                result = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                result = "Autumn";
                break;
            default :
                result = "Not a month";
                break;
        };
        System.out.println(result);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        System.out.println("Give me a month number 1-12");
        int monthNumber = scanner.nextInt();
        int days = switch (monthNumber) {
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
        if (days==28 || days==30 || days==31) {
            System.out.println(days);
        } else {
            System.out.println("Not possible");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

        System.out.println("Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): ");
        int classChoice = scanner.nextInt();

        String characterStats = switch (classChoice) {
            case 1 -> "Warrior (Strength: 9, Agility: 5, Intelligence: 2)";
            case 2 -> "Mage (Strength: 3, Agility: 4, Intelligence: 9)";
            case 3 -> "Rogue (Strength: 4, Agility: 9, Intelligence: 3)";
            case 4 -> "Cleric (Strength: 6, Agility: 3, Intelligence: 7)";
            default -> "Invalid class choice! Default stats assigned: Villager (Strength: 1, Agility: 1, Intelligence: 1)";
        };

        System.out.println(characterStats);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

        System.out.println("Which digit do you want to translate (0-9)?");
        int digit = scanner.nextInt();

        System.out.println("In which language do you want to translate your digit? (1-German, 2-English, 3-Japanese)");
        int language = scanner.nextInt();

        String translation = switch (language) {
            case 1 -> switch (digit) {
                case 0 -> "Null";
                case 1 -> "Eins";
                case 2 -> "Zwei";
                case 3 -> "Drei";
                case 4 -> "Vier";
                case 5 -> "Fünf";
                case 6 -> "Sechs";
                case 7 -> "Sieben";
                case 8 -> "Acht";
                case 9 -> "Neun";
                default -> "Ungültige Ziffer!";
            };
            case 2 ->
            case 3 -> switchJapanese(digit);
            default -> "Invalid language choice!";
        };

        System.out.println("Output: " + translation);


    }


     switch (digit) {
            case 0 -> "Null";
            case 1 -> "Eins";
            case 2 -> "Zwei";
            case 3 -> "Drei";
            case 4 -> "Vier";
            case 5 -> "Fünf";
            case 6 -> "Sechs";
            case 7 -> "Sieben";
            case 8 -> "Acht";
            case 9 -> "Neun";
            default -> "Ungültige Ziffer!";
        };
    }

    public static String switchEnglish(int digit) {
        return switch (digit) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid digit!";
        };
    }

    public static String switchJapanese(int digit) {
        return switch (digit) {
            case 0 -> "zero";
            case 1 -> "ichi";
            case 2 -> "ni";
            case 3 -> "san";
            case 4 -> "shi";
            case 5 -> "go";
            case 6 -> "roku";
            case 7 -> "nana";
            case 8 -> "hachi";
            case 9 -> "kyuu";
            default -> "Mukō na sūchi";
        };


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}