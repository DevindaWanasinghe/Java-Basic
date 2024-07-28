public class Recursion2 {
    public int factorial(int n){
        if (n == 0 ) {
            return 1;
        }else{
            return n*factorial(n-1);
            /*
             factorial(5)
              5 * factorial(4)
               5 * 4 * factorial(3)
                5 * 4 * 3 * factorial(2)
                 5 * 4 * 3 * 2 * factorial(1)
                   5 * 4 * 3 * 2 * 1 * factorial(0)
                    5 * 4 * 3 * 2 * 1 * 1
             */
        }
    }

    public static void main(String[] args) {
        int y = 5;
        Recursion2 obj = new Recursion2();
        int result = obj.factorial(y);
        System.out.println(result);
    }
    
}
