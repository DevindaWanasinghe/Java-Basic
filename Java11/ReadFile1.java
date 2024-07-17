import java.io.File;
import java.util.Scanner;

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("file1.txt"); //create object

        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) { //cheacking have line?
                System.out.println(reader.nextLine());
   
            }
            reader.close();
        }   
        catch(Exception e){
            System.out.println(e);

        }     
    }
}