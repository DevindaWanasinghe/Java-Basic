import java.io.File;
import java.io.FileReader;

public class ReadFile2 {
    public static void main(String[] args) {
            File file = new File("file1.txt"); //create object

        try {
            FileReader reader = new FileReader(file);
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);     
            }            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
