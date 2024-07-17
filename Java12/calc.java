public class calc {
    public static void main(String[] args) {
        float n1 = Float.parseFloat(args[0]); //typecasting integer value to float value
        float n2 = Float.parseFloat(args[1]); //typecasting integer value to float value
        char operator = args[2].charAt(0);  //typecasting string value to char value


        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;

            case '-':
                System.out.println(n1 - n2);
                break;

            case '*':
                System.out.println(n1 * n2);
                break;

            case '/':
                System.out.println(n1 / n2);
                break;
        
            default:
                break;
        }

    }  
}
