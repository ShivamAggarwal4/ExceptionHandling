import java.util.Scanner;

public class EmployeeExistenceCheckup {
    static Scanner scanning=new Scanner(System.in);
    public static void main(String[] args) {
        String inputEmployeeName=scanning.nextLine();
        String employeeNameList[]=generatingEmployeeNameList();
        boolean inputEmployeeNameMatched= inputEmployeeNameVerification(inputEmployeeName,employeeNameList);
        measureForExceptionHandling(inputEmployeeNameMatched);
    }
    public static void measureForExceptionHandling(boolean inputEmployeeNameMatched){
        if(inputEmployeeNameMatched==true){
            System.out.println("Input Employee Name is Matched");
        }

        else{
            try {
                throw new InputNameUnmatchedException();
            }catch(Exception e){
                System.out.println("InputNameUnmatchedException");
            }
            finally{
                System.out.println("Thankyou");
            }
        }
    }
    public static boolean inputEmployeeNameVerification(String inputEmployeeName, String employeeNameList[]){
        boolean isMatched=false;
        for(int i=0;i<10;i++){
            if(inputEmployeeName.equals(employeeNameList[i])){
                isMatched=true;
                break;
            }
//            System.out.print(isMatched);
        }

        return isMatched;
    }

    public static String[] generatingEmployeeNameList(){
        String employeeNameList[]=new String[10];
        for (int i=0;i<10;i++){
            employeeNameList[i]="Person"+i;
//           System.out.print(employeeNameList[i]);
        }
        return employeeNameList;
    }
    static class InputNameUnmatchedException extends Exception{
        @Override
        public String toString() {
            return "InputNameUnmatchedException";
        }
        @Override
        public String getMessage(){
            return "InputNameUnmatchedException";
        }
    }
}
