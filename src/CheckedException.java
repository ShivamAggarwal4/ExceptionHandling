import java.io.*;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException{



    }
    public static void readFile(){
        try{
            File myFile= new File("shivam.txt");
            Scanner scanning= new Scanner(myFile);
            while(scanning.hasNextLine()){
                String line= scanning.nextLine();
                System.out.println(line);
            }
            scanning.close();
        }catch(FileNotFoundException e){
            e.fillInStackTrace();
        }
    }
}
