import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile2 {
    public static void main(String[] args) {
        try{
            BufferedWriter writter = new BufferedWriter(new FileWriter("file2.txt",true));
            writter.write("Wanasinghe!");
            writter.newLine();
            writter.write("welcome you!");
            writter.append("txt");
            writter.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
