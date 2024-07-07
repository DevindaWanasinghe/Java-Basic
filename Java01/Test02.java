//import javax.swing.*;
import java.util.Scanner;

public class Test02 {
    //Java Getting User Input
    //Scanner

    public static void main (String []args){


        @SuppressWarnings("resource")
        Scanner x = new Scanner(System.in); //create x object for getting user input

        System.out.print("Enter Name: ");
        String name = x.nextLine(); //store user input in name variable & it is String value

        System.out.print("Enter Age: ");
        int age = x.nextInt(); //store user input in age variable &  it is int value

        System.out.print("Enter value: ");
        double value = x.nextDouble();


        System.out.println("your enter name is: "+name);
        System.out.println("your enter age is: "+age);
        System.out.println("your enter value is: "+value);









    }
}
