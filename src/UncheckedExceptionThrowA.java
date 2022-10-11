import java.util.Scanner;

public class UncheckedExceptionThrowA {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int a=Scanner.nextInt();
        int b=Scanner.nextInt();
        if(b==0) {
            try{
                throw new ArithmeticException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        int division = a/b;
        System.out.print(division);
    }


    static class ArithmeticException extends Exception{
        @Override
        public String toString() {
            return "Arithmetic Expression: b cant be zero";
        }
        @Override
        public String getMessage(){
            return "Arithmetic Expression:b cant be zero.";
        }
    }
}
