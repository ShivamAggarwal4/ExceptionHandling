import java.util.Scanner;

public class UseScoreException {
    static Scanner scanning=new Scanner(System.in);
    public static void main(String[] args) {
        scoreOutput();
        stringScore();




//        System.out.println("Enter the number");
//        int inputNumber=scanning.nextInt();
//        double squareOfNumber=squareOfNumber(inputNumber);
//        System.out.print(squareOfNumber);
    }
    public static void stringScore(){
        System.out.println("Do you want to enter another score");
        String userStringResponse=scanning.nextLine();
        if(userStringResponse.equals("Yes")) {
            System.out.println("Enter the string Score");
            String stringScore = scanning.nextLine();
            checkForStringInput(stringScore);
        }
        else{
            stringScore();
        }
    }
    public static void scoreOutput(){
    System.out.println("Do you want to enter Score?");
    String userResponse1=scanning.nextLine();
        if(userResponse1.equals("Yes")) {
        System.out.println("Enter the score");
        int inputScore = scanning.nextInt();
        scoreBoard(inputScore);
    }else {
        System.out.println("Thanks for visiting");
    }}
    public static void checkForStringInput(String stringScore){
        try {
            float numericValueOfScore = Float.parseFloat(stringScore);
        }catch(Exception NumberFormatException){
            System.out.println("NumberFormatException \n You must enter a number for the score!" );
        }
    }
    public static void scoreBoard(int inputScore){
        if(inputScore>100||inputScore<0){
            try {
                throw new ScoreException();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        else {
            System.out.println("That is a valid score." );
        }
    }
    public static double squareOfNumber(int inputNumber) {
        if(inputNumber<0) {
            try {
                throw new NegativeNumberSquareException();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    double squareOfNumber=Math.pow(inputNumber,2);
    return squareOfNumber;
    }

}
