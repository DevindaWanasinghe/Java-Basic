//Exception Handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a,b,c;
        
         try{
            System.out.println("Enter first number");
            a = num.nextInt();
            System.out.println("enter second number");
            b = num.nextInt();
            c = a/b;
            System.out.println("Answer is: "+c );
         }
         catch(ArithmeticException e){
            System.out.println("Canot devide by zero!");
         }
         catch(InputMismatchException e){
            System.out.println("Please Enter Integer Value!");
         }
         catch(Exception e){
            System.out.println(e);
         }
         finally{
            System.out.println("okay!!!");

         }

         System.out.println("bye");
    }
}
