//Java Genarics

/* 
class B {
    void print(int x){
        System.out.println(x);
    }

}
*/
class A<T>{
    void print(T x){ //Change String to Object
        T y = (T) x; //Type Casting
        System.out.println(y);
    }   
}

public class Test {
    public static void main(String[] args) {
        A<String> obj1 = new A();
         obj1.print("dewinda");
        // obj1.print(12);
        //obj1.print(5.33);

        // B obj2 = new B();
        // obj2.print(12);
        
    }
    
}
