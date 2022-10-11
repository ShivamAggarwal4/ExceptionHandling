public class UncheckedExceptionThrowC {
    public static void main(String[] args) {
    System.out.print(divide(5,4));
    }
    public static int divide(int a, int b){
        int division = a/b;
        if(b==0){
            throw new ArithmeticException();
        }
        return division;
    }
}
