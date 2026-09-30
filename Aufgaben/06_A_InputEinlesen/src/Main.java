import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.

        Scanner userInput = new Scanner(System.in);

        String firstName = IO.readln("Enter your first name\n");
        String lastName = IO.readln("Enter your last name\n");
        //String age = IO.readln("What is your age?\n");
        System.out.println("What is your age? \n");
        short result = userInput.nextShort();
        userInput.nextLine();
        System.out.println("What day is your Birthday?\n");
        byte birthdayDay = userInput.nextByte();
        userInput.nextLine();
        System.out.println("What month is your Birthday? In digits\n");
        byte birthdayMonth = userInput.nextByte();
        userInput.nextLine();
        System.out.println("In which year where you born?\n");
        short birthdayYear = userInput.nextShort();
        userInput.nextLine();
        String student = IO.readln("Are you a Student? true or false\n");
        String country = IO.readln("Where dou you come from? (Country)\n");
        String hobby = IO.readln("What is your favourite hobby?\n");
        String movie = IO.readln("What superhero would you like to be?\n");

        int days = (2026 * 360 + 9 * 30) - (birthdayYear * 360 + birthdayMonth * 30);

        IO.println("Thank you for answering all my questions " +firstName +" " +lastName);
        System.out.println("You are " +result +" years old");
        IO.println("Your birthday is on " +birthdayDay +"." + birthdayMonth +"." +birthdayYear);
        IO.println("You are a student " +student);
        IO.println("You are coming from " +country);
        IO.println("In your free time you like to do " +hobby);
        IO.println("And if you are a superhero you would be a great " +movie);
        IO.println("You are approximately " +days +" old" );

        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!



        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        System.out.println("Please type in a random number");
        float number1 = userInput.nextFloat();
        userInput.nextLine();
        System.out.println("Now please give me a second random number");
        float number2 = userInput.nextFloat();
        userInput.nextLine();

        System.out.println("addition " + (number1+number2));
        System.out.println("subtraction " + (number1-number2));
        System.out.println("division " + (number1/number2));
        System.out.println("multiplication " + (number1*number2));
        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("Could you type in your weight just in digits");
        short weight = userInput.nextShort();
        userInput.nextLine();
        System.out.println("And now your heigt in meters. Please use a point to separate the number");
        float height = userInput.nextFloat();
        userInput.nextLine();

        System.out.println("Your BMI is " + (weight/(height*height)));

        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.println("Give me a number of minutes");
        short minutes = userInput.nextShort();
        userInput.nextLine();

        System.out.println("This would be " + minutes/60 + "h and " +minutes%60 + "min");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        System.out.println("Please write a radius in digits");
        short radius = userInput.nextShort();
        userInput.nextLine();
        System.out.println("The circumference of your circle is " + 2 * 3.1415926535 * radius );
        System.out.println("And the area is " + 3.1415926535 * (radius*radius));

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        System.out.println("Please put in the bill amount without the currency symbol");
        float bill = userInput.nextFloat();
        userInput.nextLine();
        System.out.println("Now give me the percent you would like to tip also without the percent symbol");
        byte tip = userInput.nextByte();
        userInput.nextLine();
        float total = bill +  (bill/100*tip);
        System.out.println("You would have to pay " + total);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        System.out.println("Could you give me your hourly wage? Without a currency symbol");
        int hourlyWage = userInput.nextInt();
        userInput.nextLine();
        System.out.println("How many hours do you work a week? Just give me the number");
        short hoursPerWeek = userInput.nextShort();
        userInput.nextLine();
        long monthlyPay = hourlyWage*hoursPerWeek*4;
        System.out.println("Your monthly salary is " + monthlyPay + "$");
        System.out.println("And in a year you earn " + monthlyPay*12 + "$ excluding the 13. month");

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!
        //--------------------------------------------------------------------------------------------------------------

        System.out.println("--- WELCOME TO THE PHYSICS QUIZ ---");
        byte score = 0;


        System.out.println("Q 01: Wie heisst die Kraft, die Gegenstände auf den Boden zieht?");
        userInput.nextLine();
        System.out.println("Antwort: Gravitation (oder Schwerkraft). Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 02: Welcher Buchstabe steht in der Physik für die Lichtgeschwindigkeit?");
        userInput.nextLine();
        System.out.println("Antwort: c. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 03: Wie nennt man die kleinsten Bausteine des Lichts (Lichtquanten)?");
        userInput.nextLine();
        System.out.println("Antwort: Photonen. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 04: Welches negativ geladene Teilchen umkreist den Atomkern?");
        userInput.nextLine();
        System.out.println("Antwort: Elektron. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 05: In welcher Einheit wird der elektrische Widerstand gemessen?");
        userInput.nextLine();
        System.out.println("Antwort: Ohm. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 06: Wie heisst der Effekt, wenn die Sirene eines Krankenwagens beim Vorbeifahren ihren Ton verändert?");
        userInput.nextLine();
        System.out.println("Antwort: Doppler-Effekt. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 07: Wie heisst das berühmte Gedankenexperiment von Erwin Schrödinger mit einem Tier in der Kiste?");
        userInput.nextLine();
        System.out.println("Antwort: Schrödingers Katze. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 08: Welcher Planet in unserem Sonnensystem hat die stärkste Gravitation?");
        userInput.nextLine();
        System.out.println("Antwort: Jupiter. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 09: Wie nennt man ein Objekt im All, dessen Anziehungskraft so stark ist, dass selbst Licht nicht entkommen kann?");
        userInput.nextLine();
        System.out.println("Antwort: Schwarzes Loch. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("Q 10: Welches Gesetz besagt, dass Energie niemals verloren geht, sondern nur umgewandelt wird?");
        userInput.nextLine();
        System.out.println("Antwort: Energieerhaltungssatz. Wenn du richtig liegst, tippe 1, sonst 0:");
        score += userInput.nextByte();
        userInput.nextLine();


        System.out.println("\nDanke fürs Mitmachen!");
        System.out.println("Du hast insgesamt " + score + " von 10 Punkten erreicht!");


        // Make sure you didn't forget to close the scanner :)
        userInput.close();
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);