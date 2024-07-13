//wrapper class
public class Test03 {
    public static void main(String[] args) {
        int x = 12;
        Integer y = Integer.valueOf(x); //Boxing/ wrapping
        Integer z = x;  //Auto boxing / auto wrapping

        Integer a = 3; //Integee type wrapper class
        int b = a.intValue(); //wrapper class object convert to primitive type vaiable //This is Unboxing / unwrapping
        int c = a; //Auto unboxing / auto wrapping

    }
    
}
