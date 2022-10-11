//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseScoreException {
    static Scanner scanning;

    public UseScoreException() {
    }

    public static void main(String[] args) {
        inputUserScoreAndPrintOutput();
    }

    public static void inputUserScoreAndPrintOutput() {
        boolean inCorrectScore = true;
        int count = 0;

        while(true) {
            String userResponse1;
            do {
                if (!inCorrectScore) {
                    return;
                }

                if (count == 0) {
                    System.out.println("Do you want to enter Score?");
                } else {
                    System.out.println("Do you want to enter another Score?");
                }

                userResponse1 = scanning.nextLine();
            } while(!userResponse1.equals("Yes") && !userResponse1.equals("Y"));

            System.out.println("Enter the score");

            try {
                int inputScore = scanning.nextInt();
                if (!checkForOutOfRangeInputScore(inputScore)) {
                    System.out.println("The entered score is correct");
                    inCorrectScore = false;
                } else {
                    ++count;
                }
            } catch (InputMismatchException var4) {
                ++count;
                System.out.println("Please enter an integer");
            }
        }
    }

    public static boolean checkForStringInputScore(int inputScore) {
        boolean isAString = false;

        try {
            float var2 = Float.parseFloat(Integer.toString(inputScore));
        } catch (Exception var3) {
            isAString = true;
            System.out.println("NumberFormatException \n You must enter a number for the score!");
        }

        return isAString;
    }

    public static boolean checkForOutOfRangeInputScore(int inputScore) {
        boolean isOutOfRange = false;
        if (inputScore > 100 || inputScore < 0) {
            isOutOfRange = true;

            try {
                throw new ScoreException();
            } catch (Exception var3) {
                System.out.println(var3.getMessage());
            }
        }

        return isOutOfRange;
    }

    static {
        scanning = new Scanner(System.in);
    }
}
