import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        String txt = "\n I Love Java!";
        try{
            FileWriter writter = new FileWriter("file1.txt",true);
            //writter.write(txt);
            writter.append(txt);
            writter.close();

        }
        catch(Exception e){
            System.out.println(e);
        }       
    }
    
}
