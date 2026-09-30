
void main() {
    int number = 5;
    if (number>1){
        System.out.println("The number is greater than 1");
    }
    int number1 = 5;
    if (number1==5){
        System.out.println("The number1 is 5");
    }
    int number2 = 5;
    int number3 = 10;
    boolean b = number2 < number3;
    System.out.println(b +" the number2 is smaller than number 3");

    int age = 18;
    if (age>=18){
        System.out.println("Volljährig");
    }else{
        System.out.println("Minderjährig");
    }
    int time = 20;
    String result = (time > 18) ? "It's evening!" : "It's afternoon";
    System.out.println(result);

    int number4 = 0;
    if (number4 > 0) {
        System.out.println("Positive!");
    } else if (number4 == 0) {
        System.out.println("Zero!");
    } else {
        System.out.println("Negative!");
    }



}
