//switch case
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int weekday = x.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
        
    }
    

}
