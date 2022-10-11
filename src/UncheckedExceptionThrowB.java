public class UncheckedExceptionThrowB {

    public static int divide(int a, int b) throws ArithmeticException{
        int division = a/b;
        if(b==0){
            throw new ArithmeticException();
        }
        return division;
    }
    public static void main(String[] args){

        try {
            int check = divide(5, 0);
            System.out.print(check);
        }catch(Exception e){
            System.out.print("ArithmeticException");
        }
    }
    }


